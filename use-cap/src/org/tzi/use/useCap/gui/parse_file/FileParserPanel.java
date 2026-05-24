package org.tzi.use.useCap.gui.parse_file;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.tzi.use.useCap.ast.ASTInterface;
import org.tzi.use.useCap.parser.UseSpecSplitter;
import org.tzi.use.useCap.use.ASTToJSONConverter;
import org.tzi.use.parser.ParseErrorHandler;
import org.tzi.use.parser.use.ASTClass;
import org.tzi.use.parser.use.ASTModel;
import org.tzi.use.parser.use.CAPAnnotation;
import org.tzi.use.parser.use.USELexer;
import org.tzi.use.parser.use.USEParser;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.ModelFactory;

import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.tzi.use.useCap.gui.parser.CapPaserPanel.generateNameFromAST;
import static org.tzi.use.useCap.util.CommonVar.corePath;import static org.tzi.use.useCap.util.CommonVar.oclPath;import static org.tzi.use.useCap.util.FileUtils.cleanExcessiveBlankLines;
import static org.tzi.use.useCap.util.FileUtils.saveContentToFixedFile;
import static org.tzi.use.useCap.util.UseUtils.constraintExecutor;
import static org.tzi.use.useCap.util.UseUtils.mappingToASTInterface;
import static org.tzi.use.parser.use.USECompiler.compileSpecification;

public class FileParserPanel extends JPanel {

  private JTextArea leftTextArea;
  private JTextArea rightTextArea;

  private File inputFile;
  private File outputFile;

  public FileParserPanel() {
    initUI();
  }

  private void initUI() {
    setLayout(new BorderLayout(8, 8));

    Font textFont = new Font(Font.MONOSPACED, Font.PLAIN, 20);

    // ===== LEFT TEXT AREA =====
    leftTextArea = new JTextArea();
    leftTextArea.setFont(textFont);
    leftTextArea.setEditable(true);

    JScrollPane leftScroll = new JScrollPane(leftTextArea);
    leftScroll.setBorder(BorderFactory.createTitledBorder("Input File"));
    leftScroll.setRowHeaderView(new LineNumberView(leftTextArea));

    JButton uploadButton = new JButton("Upload File");
    JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
    leftPanel.add(uploadButton, BorderLayout.NORTH);
    leftPanel.add(leftScroll, BorderLayout.CENTER);

    uploadButton.addActionListener(e -> uploadFile());

    // ===== RIGHT TEXT AREA =====
    rightTextArea = new JTextArea();
    rightTextArea.setFont(textFont);
    rightTextArea.setEditable(true);

    JScrollPane rightScroll = new JScrollPane(rightTextArea);
    rightScroll.setBorder(BorderFactory.createTitledBorder("Output File"));
    rightScroll.setRowHeaderView(new LineNumberView(rightTextArea));

    JButton downloadButton = new JButton("Download File");
    JButton validateButton = new JButton("Validate .use file");

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 5));
    buttonPanel.add(validateButton);
    buttonPanel.add(downloadButton);

    JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
    rightPanel.add(rightScroll, BorderLayout.CENTER);
    rightPanel.add(buttonPanel, BorderLayout.SOUTH);

    downloadButton.addActionListener(e -> downloadFile());
    validateButton.addActionListener(e -> validateUseFile());

    // a pane to hold the left and right panels with a divider in the middle
    JSplitPane splitPane = new JSplitPane(
        JSplitPane.HORIZONTAL_SPLIT,
        leftPanel,
        rightPanel
    );
    // dividee equally
    splitPane.setResizeWeight(0.5);
    splitPane.setContinuousLayout(true);

    // ===== CONVERT BUTTON =====
    JButton convertButton = new JButton("Convert →");
    convertButton.setPreferredSize(new Dimension(120, 40));
    convertButton.addActionListener(e -> {
      try {
        convertFile();
      } catch (Exception ex) {
        ex.printStackTrace();

        JOptionPane.showMessageDialog(
            this,
            ex.getMessage(),
            "Conversion Error",
            JOptionPane.ERROR_MESSAGE
        );
      }
    });

    JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    centerPanel.add(convertButton);

    // ===== ADD TO MAIN =====
    add(splitPane, BorderLayout.CENTER);
    add(centerPanel, BorderLayout.SOUTH);
  }

  private void validateUseFile() {
    System.out.println("Validating USE file...");
    String useText = rightTextArea.getText();

    MModel model = compileUseModelFromString(useText, this);
    if (model != null) {
      JOptionPane.showMessageDialog(this, "The .use file is valid!", "Validation Success", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  // ===================== ACTIONS =====================

  private void uploadFile() {
    JFileChooser chooser = new JFileChooser();

    // only accept .use or .txt file
    chooser.setFileFilter(
        new javax.swing.filechooser.FileNameExtensionFilter(
            "Text & USE files (*.txt, *.use)", "txt", "use"
        )
    );

    chooser.setAcceptAllFileFilterUsed(false);

    int result = chooser.showOpenDialog(this);

    if (result == JFileChooser.APPROVE_OPTION) {
      File selectedFile = chooser.getSelectedFile();

      if (!isValidExtension(selectedFile)) {
        JOptionPane.showMessageDialog(
            this,
            "Only .txt or .use files are allowed!",
            "Invalid file",
            JOptionPane.ERROR_MESSAGE
        );
        return;
      }

      inputFile = selectedFile;
      leftTextArea.setText(readFile(inputFile));
    }
  }

  /**
   * Check if the file has a valid extension (.txt or .use).
   * @param file the file to check
   * @return true if the file has a valid extension, false otherwise
   */
  private boolean isValidExtension(File file) {
    String name = file.getName().toLowerCase();
    return name.endsWith(".txt") || name.endsWith(".use");
  }

  // convert the input USE spec with CAP annotations into a pure USE spec, then display in the right text area and save to a temp file for downloading
  private void convertFile() {

    // clear
    rightTextArea.setText("");

    // clear previous output by setting empty string to temp files, if failed show error message and return
    try {
      saveContentToFixedFile(
          "",
          corePath
      );
      saveContentToFixedFile(
          "",
          oclPath
      );
    } catch (IOException e) {
      JOptionPane.showMessageDialog(
          this,
          "Failed to reset temp files",
          "Error",
          JOptionPane.ERROR_MESSAGE
      );
      return;
    }

    if (leftTextArea.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(this, "Please upload a file or paste text!");
      return;
    }


    // at this point, the astModel is USE specification + annotation specification
    String inputContainsAnnotation = leftTextArea.getText();
    ASTModel astModel;
    try {
      astModel = parseAST(inputContainsAnnotation);

      // assign context, which is the nearest class into annotation, if there is no class below the annotation, show error message and return
      assignContext(astModel);
      for (CAPAnnotation cap : astModel.getCapAnnotations()) {
        System.out.println(
            "Annotation: @" + cap.getName()
                + " | contextClass = " + cap.getContextClass()
                + " | line = " + cap.getToken().getLine()
        );
      }
    } catch (Exception ex) {
      rightTextArea.setText("");
      outputFile = null;

      JOptionPane.showMessageDialog(
          this,
          "Failed to parse annotations:\n" + ex.getMessage(),
          "Parse Error",
          JOptionPane.ERROR_MESSAGE
      );

      return;
    }

    UseSpecSplitter.Result r =
        UseSpecSplitter.split(leftTextArea.getText());

    // keep the core spec for now, just print it to console
    // the annotation spec will be parsed by another approach
    String coreUse = r.coreSpec;
    try {
      // save to core temp file
      saveContentToFixedFile(coreUse, corePath);
      System.out.println("Saved core USE to temp-core.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }


    // create the MModel contains annotation
    // also save the OCL generated from annotation to a temp file for merging in later step
    MModel model = compileUseModelFromString(inputContainsAnnotation, this);

    // clear all incase model í null
    if (model == null) {
      rightTextArea.setText("");
      outputFile = null;
      return;
    }

    // the starter of the constraints
    StringBuilder sb = new StringBuilder();

    // this part is to define will the OCL generated from annotation be appended directly to the core spec, or we need to add the "constraints" keyword before appending OCL, it depends on whether there is already OCL constraint in the original USE spec, if there is already OCL constraint, we can append OCL generated from annotation directly after that, if there is no OCL constraint, we need to add the "constraints" keyword before appending OCL generated from annotation
    boolean isContainingOCL = mmodelContainsOCL(model);
    if (!isContainingOCL) {
      // ìf there is no OCL constraint in the model, we need to add the "constraints" keyword before appending OCL from annotation
      System.out.println("No OCL constraints found in the model. Appending OCL");
      sb.append("constraints\n\n");
    } else {
      // do nothing
      System.out.println("OCL constraints found in the model. Appending OCL directly");
    }

    // add each OCL into StringBuilder, then save to temp file for later merging
    for (CAPAnnotation anno : astModel.getCapAnnotations()) {
      System.out.println("Found annotation: " + anno.getName());
      ASTInterface ast = mappingToASTInterface(anno);

      // print the ASTInterface for debugging
      String ocl = constraintExecutor(ast,
          ASTToJSONConverter.toJsonObject(ast),
          anno.getContextClass() != null ? anno.getContextClass() : "ContextClass",
          generateNameFromAST(ast, anno.getContextClass() != null ? anno.getContextClass() : "ContextClass"));

      sb.append(ocl).append("\n\n");

      System.out.println("Generated OCL:\n" + ocl);
      System.out.println("============================");

      try {
        saveContentToFixedFile(
            sb.toString(),
            oclPath);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    String convertedContent = null;
    try {
      convertedContent = mergeCoreAndOCLFile(isContainingOCL);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    rightTextArea.setText(convertedContent);

    try {
      outputFile = File.createTempFile("converted_use_", ".use");
      try (FileWriter writer = new FileWriter(outputFile)) {
        writer.write(convertedContent);
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  private void downloadFile() {
    if (outputFile == null) {
      JOptionPane.showMessageDialog(this, "No converted file to download!");
      return;
    }

    JFileChooser chooser = new JFileChooser();
    chooser.setSelectedFile(new File("converted.txt"));

    int result = chooser.showSaveDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
      File target = chooser.getSelectedFile();
      copyFile(outputFile, target);
    }
  }

  // ===================== UTILS =====================

  private String readFile(File file) {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line).append("\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sb.toString();
  }

  private void copyFile(File source, File dest) {
    try (InputStream in = new FileInputStream(source);
         OutputStream out = new FileOutputStream(dest)) {

      byte[] buffer = new byte[1024];
      int length;
      while ((length = in.read(buffer)) > 0) {
        out.write(buffer, 0, length);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  /**
   * Compile a USE model from a string, also validating it and showing errors.
   *
   * @param useText
   * @return
   */
  private MModel compileUseModelFromString(
      String useText,
      Component parent
  ) {

    StringWriter errorBuffer = new StringWriter();
    PrintWriter err = new PrintWriter(errorBuffer);

    InputStream in = new ByteArrayInputStream(
        useText.getBytes(StandardCharsets.UTF_8)
    );

    MModel model = compileSpecification(
        in,
        "CAP_Input.use",
        err,
        new ModelFactory()
    );

    err.flush();

    if (model == null) {
      JOptionPane.showMessageDialog(parent,
          "USE model is invalid:\n\n" + errorBuffer,
          "USE Validation Error",
          JOptionPane.ERROR_MESSAGE);
      return null;
    }

    return model;
  }

  /**
   * Check if the MModel contains any OCL constraints (class invariants).
   *
   * @param mModel
   * @return true if there is at least 1 class invariant, false otherwise
   */
  private boolean mmodelContainsOCL(MModel mModel) {
    if (mModel == null) {
      return false;
    }

    return !mModel.classInvariants().isEmpty();
  }

  private String mergeCoreAndOCLFile(boolean hasOCL) throws IOException {
    StringBuilder sb = new StringBuilder();

    // read core spec
    String core = cleanExcessiveBlankLines(
        Files.readString(Path.of(corePath)));
    sb.append(core).append("\n\n");

    // read annotation-generated OCL spec
    String ocl = cleanExcessiveBlankLines(
        Files.readString(Path.of(oclPath)));

    // if there is OCL, read OCL file and append to core spec
    if (hasOCL) {
      // get the index of "constraints" keyword in core spec, then insert OCL after that
      int constraintsIndex = findConstraintsIndex(core);

      // get the position of the first newline after "constraints" keyword, then insert OCL before that
      int insertPos = core.indexOf('\n', constraintsIndex);

      if (insertPos == -1) {
        insertPos = core.length();
      }

      return core.substring(0, insertPos)
          + "\n\n"
          + ocl
          + "\n"
          + core.substring(insertPos);

    } else {
      sb.append(ocl).append("\n\n");
    }

    return sb.toString();
  }

  /**
   * detect the index of the "constraints" keyword in the USE spec, if not found, return -1
   * the "constraints" keyword is used to determine where to append the OCL generated from annotation, if there is no "constraints" keyword, we will add it before appending OCL
   *
   * @param useSpec
   * @return
   */
  private int findConstraintsIndex(String useSpec) {
    String[] lines = useSpec.split("\\R"); // split by any newline
    int index = 0;

    for (String line : lines) {
      String trimmed = line.trim();

      // skip empty lines
      if (trimmed.isEmpty()) {
        index += line.length() + 1;
        continue;
      }

      // skip comments
      if (trimmed.startsWith("--")) {
        index += line.length() + 1;
        continue;
      }

      // REAL constraints keyword
      if (trimmed.equals("constraints")) {
        return index;
      }

      index += line.length() + 1;
    }

    return -1;
  }

  /**
   * Parse the input USE text into an ASTModel, which contains the CAP annotations and their context (the nearest class below them).
   * @param useText the input USE specification text, which may contain CAP annotations
   * @return the ASTModel containing the CAP annotations and their context
   * @throws Exception
   */

  private ASTModel parseAST(String useText) throws Exception {

    ANTLRInputStream input =
        new ANTLRInputStream(new ByteArrayInputStream(useText.getBytes()));

    USELexer lexer = new USELexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    USEParser parser = new USEParser(tokens);

    ParseErrorHandler errHandler = new ParseErrorHandler(
        "input", new PrintWriter(System.err));

    parser.init(errHandler);

    ASTModel ast = parser.model();

    if (errHandler.errorCount() > 0) {
      throw new RuntimeException("Parse errors");
    }

    return ast;
  }

  /**
   * Assign context class to each CAP annotation in the ASTModel. The context class is determined by finding the nearest class declaration below the annotation in the source code.
   * The line numbers of the annotation and class declarations are used to determine the nearest class. If an annotation cannot be assigned a context class, an error message will be shown.
   *
   * @param model the ASTModel containing the CAP annotations and class declarations
   */
  public void assignContext(ASTModel model) {

    List<CAPAnnotation> caps = model.getCapAnnotations();
    List<ASTClass> classes = model.getClasses();
    List<String> errors = new ArrayList<>();

    for (CAPAnnotation cap : caps) {

      int annLine = cap.getToken().getLine();
      ASTClass nearest = null;
      int minDist = Integer.MAX_VALUE;

      for (ASTClass cls : classes) {

        int classLine = cls.getName().getLine();

        if (classLine > annLine) {
          int dist = classLine - annLine;

          if (dist < minDist) {
            minDist = dist;
            nearest = cls;
          }
        }
      }

      if (nearest == null) {
        errors.add("CAP annotation at line " + annLine + " is not attached to any class.");
        continue;
      }

      cap.setContextClass(nearest.getName().getText());
    }
    if (caps.stream().map(c -> c.getContextClass()).anyMatch(Objects::isNull)) {
      JOptionPane.showMessageDialog(
          this,
          String.join("\n", errors),
          "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
}