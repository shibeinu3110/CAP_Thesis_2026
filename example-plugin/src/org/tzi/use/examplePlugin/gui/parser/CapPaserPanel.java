package org.tzi.use.examplePlugin.gui.parser;

import org.tzi.use.examplePlugin.ast.ASTInterface;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintExecutor;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintInterface;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintType;
import org.tzi.use.examplePlugin.use.ASTToJSONConverter;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintDetector;
import org.tzi.use.examplePlugin.util.ASTPrinter;
import org.tzi.use.examplePlugin.util.UseUtils;

import javax.swing.*;
import java.awt.*;

public class CapPaserPanel extends JPanel {

  private JTextArea annotationArea;
  private JLabel typeLabel;
  private JTextArea oclArea;

  public CapPaserPanel() {
    initUI();
  }

  private void initUI() {
    setLayout(new BorderLayout(8, 8));
    setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

    // ===== LEFT: Annotation input =====
    annotationArea = new JTextArea();
    annotationArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
    annotationArea.setLineWrap(true);
    annotationArea.setWrapStyleWord(true);

    JScrollPane leftScroll = new JScrollPane(annotationArea);
    leftScroll.setBorder(BorderFactory.createTitledBorder("Annotation Input"));

    // ===== RIGHT: Result =====
//    typeLabel = new JLabel("Type: —", SwingConstants.CENTER);
//    typeLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
//
//    JPanel rightPanel = new JPanel(new BorderLayout());
//    rightPanel.setBorder(BorderFactory.createTitledBorder("Result"));
//    rightPanel.add(typeLabel, BorderLayout.CENTER);
    // ===== RIGHT: Result =====
    typeLabel = new JLabel("Type: —");
    typeLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
    typeLabel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

    // OCL output area
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

    // Right panel layout
    JPanel rightPanel = new JPanel(new BorderLayout(6, 6));
    rightPanel.setBorder(BorderFactory.createTitledBorder("Result"));
    rightPanel.add(typeLabel, BorderLayout.NORTH);
    rightPanel.add(oclScroll, BorderLayout.CENTER);

    // ===== SPLIT PANE =====
    JSplitPane splitPane = new JSplitPane(
        JSplitPane.HORIZONTAL_SPLIT,
        leftScroll,
        rightPanel
    );
    splitPane.setResizeWeight(0.7);     // 70% left, 30% right
    splitPane.setDividerSize(6);
    splitPane.setContinuousLayout(true);

    // ===== BOTTOM: Convert button =====
    JButton convertBtn = new JButton("Convert →");
    convertBtn.setPreferredSize(new Dimension(140, 36));
    convertBtn.addActionListener(e -> onConvert());

    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    bottomPanel.add(convertBtn);

    // ===== ADD ALL =====
    add(splitPane, BorderLayout.CENTER);
    add(bottomPanel, BorderLayout.SOUTH);
  }

  private void onConvert() {
    String annotation = annotationArea.getText();

    if (annotation == null || annotation.isBlank()) {
      JOptionPane.showMessageDialog(
          this,
          "Please input SumConstraint annotation",
          "Input Error",
          JOptionPane.WARNING_MESSAGE
      );
      return;
    }

    try {
      // Parse text → AST
      ASTInterface astInterface = UseUtils.parseASTFromText(annotation);
      System.out.println("Parsed AST:");
      ASTPrinter.print(astInterface);

      System.out.println("==============================");
      System.out.println(ASTToJSONConverter.toJsonObject(astInterface));
      // Detect type
      SumConstraintDetector detector = new SumConstraintDetector();
      SumConstraintType type = detector.detectType(astInterface);
      typeLabel.setText("Type: " + type);

      System.out.println(ASTToJSONConverter.toJsonObject(astInterface));

      System.out.println("===================Parsed Model===================");
      String ocl =
          SumConstraintExecutor.execute(
              astInterface,
              ASTToJSONConverter.toJsonObject(astInterface),
              "Student",
              "T1_TotalCredits"
          );

      System.out.println(ocl);

      oclArea.setText(ocl);
      oclArea.setCaretPosition(0);


      System.out.println("Parse completed.");

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
}
