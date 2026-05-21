package org.tzi.use.examplePlugin.gui.create;

import org.tzi.use.examplePlugin.gui.management.CapManagePanel;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.parser.use.USECompiler;
import org.tzi.use.uml.mm.ModelFactory;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static org.tzi.use.examplePlugin.util.CommonVar.CAP_ROOT;
import static org.tzi.use.examplePlugin.util.FileUtils.getCurrentCAP;
import static org.tzi.use.examplePlugin.util.GUIUtils.showErrorDialog;

/**
 * Panel for creating and saving CAPs.
 */

public class CapCreatePanel extends JPanel {
  private JTextField capNameField;
  private JTextArea grammarArea;
  private JTextArea descriptionArea;

  // whether this panel is in edit mode (editing existing CAP) or create mode (creating new CAP)
  // if 'true', then it is edit mode and 'false' means create mode
  private final boolean editMode;

  // in edit mode, we need to keep track of the original CAP name to know which folder to update
  private final String originalCapName;
  private JPanel previousPanel;

  // constructor for create mode
  public CapCreatePanel() {
    this.editMode = false;
    this.originalCapName = null;
    initUI();
  }

  // constructor for edit mode, takes the CAP name to load and the previous panel to return to after editing
  public CapCreatePanel(String capName, JPanel previousPanel) {
    this.editMode = true;
    this.originalCapName = capName;
    this.previousPanel = previousPanel;

    initUI();
    loadExistingCap(capName);
  }

  private void initUI() {
    setLayout(new BorderLayout(10, 10));
    setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

    // ===== NAME PANEL =====
    JPanel namePanel = new JPanel(new BorderLayout(5, 5));
    namePanel.add(new JLabel("CAP Name:"), BorderLayout.WEST);
    capNameField = new JTextField();
    namePanel.add(capNameField, BorderLayout.CENTER);

    // ===== GRAMMAR =====
    // create as a new JTextArea with monospaced font and no line wrap for better code editing experience
    grammarArea = new JTextArea();
    grammarArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
    grammarArea.setLineWrap(false);
    grammarArea.setTabSize(2);

    JScrollPane grammarScroll = new JScrollPane(grammarArea);
    grammarScroll.setBorder(
        BorderFactory.createTitledBorder("CAP Grammar (.use)")
    );

    // ===== DESCRIPTION =====
    // create as a new JTextArea with line wrap for better text editing experience
    descriptionArea = new JTextArea(5, 20);
    descriptionArea.setLineWrap(true);
    descriptionArea.setWrapStyleWord(true);

    JScrollPane descScroll = new JScrollPane(descriptionArea);
    descScroll.setBorder(
        BorderFactory.createTitledBorder("Description")
    );

    // add grammar and description in a split pane for better use of space
    JSplitPane splitPane = new JSplitPane(
        JSplitPane.VERTICAL_SPLIT,
        grammarScroll,
        descScroll
    );
    splitPane.setResizeWeight(0.75);

    // ===== BUTTONS =====
    JButton loadFileButton = new JButton("Load .use file");
    loadFileButton.addActionListener(e -> loadUseFile());

    JButton saveButton = new JButton("Add CAP");
    saveButton.addActionListener(e -> saveCap());

    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
    buttonPanel.add(loadFileButton);
    buttonPanel.add(saveButton);

    // ===== COMPOSE =====
    // add panels to this panel (name at top, split pane in center, buttons at bottom)
    // add is equals to this.add, which means add to this panel (CapCreatePanel)
    add(namePanel, BorderLayout.NORTH);
    add(splitPane, BorderLayout.CENTER);
    add(buttonPanel, BorderLayout.SOUTH);
  }

  private void saveCap() {
    if (!editMode) {
      createCap();
    } else {
      updateCap();
    }
  }

  /**
   * Create a new CAP by saving the grammar and description to a new folder named after the CAP name.
    * The folder will be created under the CAP_ROOT directory. If a folder with the same name already exists, an error will be shown and the creation will be aborted.
   *
   */
  private void createCap() {
    String capName = capNameField.getText().trim();

    // duplication check: if a CAP with the same name already exists, show an error and do not proceed
    if (getCurrentCAP().contains(capName)) {
      showErrorDialog(this,
          "CAP with name '" + capName + "' already exists. Please choose a different name.");
      return;
    }

    String grammar = grammarArea.getText();
    String description = descriptionArea.getText();

    MModel model = compileUseModelFromString(grammar, this);
    if (model == null) {
      return;
    }

    if (capName.isEmpty()) {
      showErrorDialog(this,
          "CAP name cannot be empty.");
      return;
    }

    try {
      Path capFolder = CAP_ROOT.resolve(capName);
      Files.createDirectories(capFolder);

      writeFile(capFolder.resolve("cap_name.txt"), capName);
      writeFile(capFolder.resolve("grammar.use"), grammar);
      writeFile(capFolder.resolve("description.txt"), description);

      JOptionPane.showMessageDialog(this,
          "CAP saved successfully!",
          "Success",
          JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException ex) {
      showErrorDialog(this,
          "Failed to save CAP:\n" + ex.getMessage());
    }
  }

  private void updateCap() {
    String grammar = grammarArea.getText();
    String description = descriptionArea.getText();

    MModel model = compileUseModelFromString(grammar, this);
    if (model == null) return;

    try {
      Path capFolder = CAP_ROOT.resolve(originalCapName);

      writeFile(capFolder.resolve("grammar.use"), grammar);
      writeFile(capFolder.resolve("description.txt"), description);

      JOptionPane.showMessageDialog(this,
          "CAP updated successfully!");

      backToManagement();

    } catch (IOException ex) {
      showErrorDialog(this,
          "Failed to update CAP:\n" + ex.getMessage());
    }
  }

  /**
   * Write content to a file, if the file already exists, it will be overwritten.
    * This is a helper method to simplify file writing in this class.
   * @param path the path to the file to write to
   * @param content the content to write to the file
   * @throws IOException if an I/O error occurs writing to or creating the file
   */
  private void writeFile(Path path, String content) throws IOException {
    Files.write(path,
        content.getBytes(),
        StandardOpenOption.CREATE,
        StandardOpenOption.TRUNCATE_EXISTING);
  }

  /**
   * Compile a USE model from a string, also validating it and showing errors.
   * @param useText the USE model text to compile
   * @param parent the parent component for showing error dialogs
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

    // use the USECompiler to compile the model, if there are errors, they will be captured in the errorBuffer
    MModel model = USECompiler.compileSpecification(
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


  // option to load an existing .use file from the filesystem into the grammar area for editing, with validation
  private void loadUseFile() {
    JFileChooser chooser = new JFileChooser();
    chooser.setFileFilter(new FileNameExtensionFilter(
        "USE Model (*.use)", "use"
    ));

    int option = chooser.showOpenDialog(this);
    if (option != JFileChooser.APPROVE_OPTION) {
      return;
    }

    Path file = chooser.getSelectedFile().toPath();

    // load file and also validate it as a USE model, if valid, show success message, if not show error message with validation errors
    try {
      String content = Files.readString(file, StandardCharsets.UTF_8);
      grammarArea.setText(content);

      MModel model = compileUseModelFromString(content, this);
      if (model != null) {
        JOptionPane.showMessageDialog(this,
            "USE model loaded and validated successfully.",
            "OK",
            JOptionPane.INFORMATION_MESSAGE);
      }

    } catch (IOException ex) {
      showErrorDialog(this,
          "Failed to load file:\n" + ex.getMessage());
    }
  }

  // Load existing CAP data into the form for editing
  private void loadExistingCap(String capName) {
    try {
      Path capFolder = CAP_ROOT.resolve(capName);

      capNameField.setText(capName);
      grammarArea.setText(
          Files.readString(capFolder.resolve("grammar.use"))
      );
      descriptionArea.setText(
          Files.readString(capFolder.resolve("description.txt"))
      );

    } catch (IOException e) {
      showErrorDialog(this,
          "Failed to load CAP data:\n" + e.getMessage());
    }
  }

  // Navigate back to the CAP management panel
  private void backToManagement() {
    Container parent = getParent();
    parent.remove(this);
    parent.add(new CapManagePanel());
    parent.revalidate();
    parent.repaint();
  }
}
