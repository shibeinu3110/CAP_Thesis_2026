//package org.tzi.use.examplePlugin.gui.parser;
//
//import org.tzi.use.examplePlugin.ast.ASTInterface;
//import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintExecutor;
//import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintInterface;
//import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintType;
//import org.tzi.use.examplePlugin.use.ASTToJSONConverter;
//import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintDetector;
//import org.tzi.use.examplePlugin.util.ASTPrinter;
//import org.tzi.use.examplePlugin.util.UseUtils;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class CapPaserPanel extends JPanel {
//
//  private JTextArea annotationArea;
//  private JLabel typeLabel;
//  private JTextArea oclArea;
//  private JTextField contextField;
//  private JTextField nameField;
//
//
//  public CapPaserPanel() {
//    initUI();
//  }
//
//  private void initUI() {
//    setLayout(new BorderLayout(8, 8));
//    setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
//
//    // ===== Context + Name input (LEFT) =====
//    JPanel metaPanel = new JPanel(new GridBagLayout());
//    metaPanel.setBorder(BorderFactory.createTitledBorder("OCL Metadata"));
//
//    GridBagConstraints gbc = new GridBagConstraints();
//    gbc.insets = new Insets(4, 4, 4, 4);
//    gbc.fill = GridBagConstraints.HORIZONTAL;
//    gbc.weightx = 1.0;
//
//    // Context
//    gbc.gridx = 0;
//    gbc.gridy = 0;
//    metaPanel.add(new JLabel("Context:"), gbc);
//
//    gbc.gridx = 1;
//    contextField = createPlaceholderField("input your context (e.g. Student)");
//    metaPanel.add(contextField, gbc);
//
//    // Name
//    gbc.gridx = 0;
//    gbc.gridy = 1;
//    metaPanel.add(new JLabel("Name:"), gbc);
//
//    gbc.gridx = 1;
//    nameField = createPlaceholderField("input your OCL name");
//    metaPanel.add(nameField, gbc);
//
//    // ===== LEFT: Annotation input =====
//    annotationArea = new JTextArea();
//    annotationArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
//    annotationArea.setLineWrap(true);
//    annotationArea.setWrapStyleWord(true);
//
//    JScrollPane leftScroll = new JScrollPane(annotationArea);
//    leftScroll.setBorder(BorderFactory.createTitledBorder("Annotation Input"));
//
//    JPanel leftPanel = new JPanel(new BorderLayout(6, 6));
//    leftPanel.add(metaPanel, BorderLayout.NORTH);
//    leftPanel.add(annotationScroll, BorderLayout.CENTER);
//
//    // ===== RIGHT: Result =====
//    typeLabel = new JLabel("Type: —");
//    typeLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
//    typeLabel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
//
//    // OCL output area
//    oclArea = new JTextArea();
//    oclArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
//    oclArea.setEditable(false);
//    oclArea.setLineWrap(true);
//    oclArea.setWrapStyleWord(true);
//    oclArea.setBackground(new Color(245, 245, 245));
//
//    JScrollPane oclScroll = new JScrollPane(oclArea);
//    oclScroll.setBorder(
//        BorderFactory.createTitledBorder("Generated OCL")
//    );
//
//    // Right panel layout
//    JPanel rightPanel = new JPanel(new BorderLayout(6, 6));
//    rightPanel.setBorder(BorderFactory.createTitledBorder("Result"));
////    rightPanel.add(typeLabel, BorderLayout.NORTH);
////    rightPanel.add(oclScroll, BorderLayout.CENTER);
//    JPanel topRight = new JPanel(new BorderLayout(4, 4));
//    topRight.add(typeLabel, BorderLayout.NORTH);
//    topRight.add(metaPanel, BorderLayout.CENTER);
//
//    rightPanel.add(topRight, BorderLayout.NORTH);
//    rightPanel.add(oclScroll, BorderLayout.CENTER);
//
//    // ===== SPLIT PANE =====
//    JSplitPane splitPane = new JSplitPane(
//        JSplitPane.HORIZONTAL_SPLIT,
//        leftScroll,
//        rightPanel
//    );
//    splitPane.setResizeWeight(0.7);     // 70% left, 30% right
//    splitPane.setDividerSize(6);
//    splitPane.setContinuousLayout(true);
//
//    // ===== BOTTOM: Convert button =====
//    JButton convertBtn = new JButton("Convert →");
//    convertBtn.setPreferredSize(new Dimension(140, 36));
//    convertBtn.addActionListener(e -> onConvert());
//
//    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//    bottomPanel.add(convertBtn);
//
//    // ===== ADD ALL =====
//    add(splitPane, BorderLayout.CENTER);
//    add(bottomPanel, BorderLayout.SOUTH);
//  }
//
//  private void onConvert() {
//    String annotation = annotationArea.getText();
//
//    if (annotation == null || annotation.isBlank()) {
//      JOptionPane.showMessageDialog(
//          this,
//          "Please input SumConstraint annotation",
//          "Input Error",
//          JOptionPane.WARNING_MESSAGE
//      );
//      return;
//    }
//
//    try {
//      // Get context and name
//      String context = contextField.getText();
//      String name = nameField.getText();
//
//      if (context.isBlank() || name.isBlank()) {
//        JOptionPane.showMessageDialog(
//            this,
//            "Context and Name must not be empty",
//            "Input Error",
//            JOptionPane.WARNING_MESSAGE
//        );
//        return;
//      }
//
//      // Parse text → AST
//      ASTInterface astInterface = UseUtils.parseASTFromText(annotation);
//      System.out.println("Parsed AST:");
//      ASTPrinter.print(astInterface);
//
//      System.out.println("==============================");
//      System.out.println(ASTToJSONConverter.toJsonObject(astInterface));
//      // Detect type
//      SumConstraintDetector detector = new SumConstraintDetector();
//      SumConstraintType type = detector.detectType(astInterface);
//      typeLabel.setText("Type: " + type);
//
//      System.out.println(ASTToJSONConverter.toJsonObject(astInterface));
//
//      System.out.println("===================Parsed Model===================");
//      String ocl =
//          SumConstraintExecutor.execute(
//              astInterface,
//              ASTToJSONConverter.toJsonObject(astInterface),
//              context,
//              name
//          );
//
//      System.out.println(ocl);
//
//      oclArea.setText(ocl);
//      oclArea.setCaretPosition(0);
//
//
//      System.out.println("Parse completed.");
//
//    } catch (Exception ex) {
//      typeLabel.setText("Type: ERROR");
//      JOptionPane.showMessageDialog(
//          this,
//          ex.getMessage(),
//          "Parse Error",
//          JOptionPane.ERROR_MESSAGE
//      );
//    }
//  }
//
//  // placeholder
//  private JTextField createPlaceholderField(String placeholder) {
//    JTextField field = new JTextField();
//    field.setForeground(Color.GRAY);
//    field.setText(placeholder);
//
//    field.addFocusListener(new java.awt.event.FocusAdapter() {
//      @Override
//      public void focusGained(java.awt.event.FocusEvent e) {
//        if (field.getText().equals(placeholder)) {
//          field.setText("");
//          field.setForeground(Color.BLACK);
//        }
//      }
//
//      @Override
//      public void focusLost(java.awt.event.FocusEvent e) {
//        if (field.getText().isBlank()) {
//          field.setText(placeholder);
//          field.setForeground(Color.GRAY);
//        }
//      }
//    });
//
//    return field;
//  }
//}
package org.tzi.use.examplePlugin.gui.parser;

import org.tzi.use.examplePlugin.ast.ASTInterface;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintExecutor;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintType;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintDetector;
import org.tzi.use.examplePlugin.use.ASTToJSONConverter;
import org.tzi.use.examplePlugin.util.ASTPrinter;
import org.tzi.use.examplePlugin.util.UseUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CapPaserPanel extends JPanel {

  private JTextArea annotationArea;
  private JTextArea oclArea;
  private JLabel typeLabel;

  private JTextField contextField;
  private JTextField nameField;

  public CapPaserPanel() {
    initUI();
  }

  /* =========================================================
   * UI INIT
   * ========================================================= */
  private void initUI() {
    setLayout(new BorderLayout(8, 8));
    setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

    /* ================= LEFT PANEL ================= */

    // ---- Meta (Context + Name)
    JPanel metaPanel = new JPanel(new GridBagLayout());
    metaPanel.setBorder(BorderFactory.createTitledBorder("OCL Metadata"));

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(4, 4, 4, 4);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1.0;

    // Context
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.weightx = 0;
    metaPanel.add(new JLabel("Context:"), gbc);

    gbc.gridx = 1;
    gbc.weightx = 1.0;
    contextField = createPlaceholderField("input your context (e.g. Student)");
    metaPanel.add(contextField, gbc);

    // Name
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.weightx = 0;
    metaPanel.add(new JLabel("Name:"), gbc);

    gbc.gridx = 1;
    gbc.weightx = 1.0;
    nameField = createPlaceholderField("input your OCL name");
    metaPanel.add(nameField, gbc);

    // ---- Annotation input
    annotationArea = new JTextArea();
    annotationArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
    annotationArea.setLineWrap(true);
    annotationArea.setWrapStyleWord(true);

    JScrollPane annotationScroll = new JScrollPane(annotationArea);
    annotationScroll.setBorder(
        BorderFactory.createTitledBorder("Annotation Input")
    );

    JPanel leftPanel = new JPanel(new BorderLayout(6, 6));
    leftPanel.add(metaPanel, BorderLayout.NORTH);
    leftPanel.add(annotationScroll, BorderLayout.CENTER);

    /* ================= RIGHT PANEL ================= */

    typeLabel = new JLabel("Type: —");
    typeLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
    typeLabel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

    oclArea = new JTextArea();
    oclArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
    oclArea.setEditable(false);
    oclArea.setLineWrap(true);
    oclArea.setWrapStyleWord(true);
    oclArea.setBackground(new Color(245, 245, 245));

    JScrollPane oclScroll = new JScrollPane(oclArea);
    oclScroll.setBorder(
        BorderFactory.createTitledBorder("Generated OCL")
    );

    JPanel rightPanel = new JPanel(new BorderLayout(6, 6));
    rightPanel.setBorder(BorderFactory.createTitledBorder("Result"));
    rightPanel.add(typeLabel, BorderLayout.NORTH);
    rightPanel.add(oclScroll, BorderLayout.CENTER);

    /* ================= SPLIT ================= */

    JSplitPane splitPane = new JSplitPane(
        JSplitPane.HORIZONTAL_SPLIT,
        leftPanel,
        rightPanel
    );
    splitPane.setResizeWeight(0.65);
    splitPane.setDividerSize(6);
    splitPane.setContinuousLayout(true);

    /* ================= BOTTOM ================= */

    JButton convertBtn = new JButton("Convert →");
    convertBtn.setPreferredSize(new Dimension(140, 36));
    convertBtn.addActionListener(e -> onConvert());

    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    bottomPanel.add(convertBtn);

    /* ================= ADD ================= */

    add(splitPane, BorderLayout.CENTER);
    add(bottomPanel, BorderLayout.SOUTH);
  }

  /* =========================================================
   * ACTION
   * ========================================================= */
  private void onConvert() {
    String annotation = annotationArea.getText();

    if (annotation == null || annotation.isBlank()) {
      showWarn("Please input SumConstraint annotation");
      return;
    }

    String context = getRealText(contextField);
    String name = getRealText(nameField);

    if (context.isBlank() || name.isBlank()) {
      showWarn("Please input Context and OCL Name");
      return;
    }

    try {
      ASTInterface ast = UseUtils.parseASTFromText(annotation);

      System.out.println("Parsed AST:");
      ASTPrinter.print(ast);

      SumConstraintDetector detector = new SumConstraintDetector();
      SumConstraintType type = detector.detectType(ast);
      typeLabel.setText("Type: " + type);

      String ocl = SumConstraintExecutor.execute(
          ast,
          ASTToJSONConverter.toJsonObject(ast),
          context,
          name
      );

      oclArea.setText(ocl);
      oclArea.setCaretPosition(0);

    } catch (Exception ex) {
      typeLabel.setText("Type: ERROR");
      JOptionPane.showMessageDialog(
          this,
          ex.getMessage(),
          "Parse Error",
          JOptionPane.ERROR_MESSAGE
      );
    }
  }

  /* =========================================================
   * HELPERS
   * ========================================================= */

  private JTextField createPlaceholderField(String placeholder) {
    JTextField field = new JTextField();
    field.setText(placeholder);
    field.setForeground(Color.GRAY);

    field.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent e) {
        if (field.getText().equals(placeholder)) {
          field.setText("");
          field.setForeground(Color.BLACK);
        }
      }

      @Override
      public void focusLost(FocusEvent e) {
        if (field.getText().isBlank()) {
          field.setText(placeholder);
          field.setForeground(Color.GRAY);
        }
      }
    });

    return field;
  }

  private String getRealText(JTextField field) {
    return field.getForeground().equals(Color.GRAY)
        ? ""
        : field.getText().trim();
  }

  private void showWarn(String msg) {
    JOptionPane.showMessageDialog(
        this,
        msg,
        "Input Error",
        JOptionPane.WARNING_MESSAGE
    );
  }
}
