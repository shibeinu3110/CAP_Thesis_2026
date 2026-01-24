package org.tzi.use.examplePlugin.gui;

import org.tzi.use.examplePlugin.ast.ASTInterface;
import org.tzi.use.examplePlugin.gui.create.CapCreateView;
import org.tzi.use.examplePlugin.gui.management.CapManageView;
import org.tzi.use.examplePlugin.gui.parser.CapParserView;
import org.tzi.use.examplePlugin.parser.CAPCompiler;
import org.tzi.use.examplePlugin.parser.CAPParser;
import org.tzi.use.examplePlugin.util.ASTPrinter;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.gui.main.ViewFrame;
import org.tzi.use.gui.views.View;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.tzi.use.examplePlugin.util.GUIUtils.createCardButton;
import static org.tzi.use.examplePlugin.util.GUIUtils.setMaximumFrameSize;

public class CapCrudView extends JPanel implements View {

  public CapCrudView() {
    setLayout(new GridBagLayout());
    setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    setFocusable(true);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(15, 15, 15, 15);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;

    add(createCardButton(
        "Create CAP",
        "Create a new CAP specification",
        UIManager.getIcon("FileView.fileIcon"),
        this::openCreateCap
    ), gbc);

    gbc.gridy++;

    add(createCardButton(
        "Manage CAP",
        "View, edit, delete and open diagrams",
        UIManager.getIcon("FileView.directoryIcon"),
        this::openManageCap
    ), gbc);

    gbc.gridy++;

    add(createCardButton(
        "Convert Annotation to OCL",
        "Convert from Annotation to OCL",
        UIManager.getIcon("FileView.directoryIcon"),
        this::parseAnnotation
    ), gbc);
  }

  private void parseAnnotation() {

//    String annotation = """
//                          @SumConstraint(
//                         	name='cm04_total',  assocCls =@AssocCls(as1='Enrolment'),
//                         	rolePath=@RolePath(r1='offering',r2='module'),
//                         	collect1={ @AttrCond(attr='grade', minLim='C') },
//                         	sumAttr='credits',
//                         	collect2={ @AttrCond(attr='grade', minLim='C'),
//                                     @AttrCond(attr='type',  matchVal='CORE') },
//                         	sumAttr1='credits',
//                         	fixAttr={@CompCond(val=sumAttr, maxLim=sumAttr1)}
//                          )""";
//
//
//    PrintWriter err = new PrintWriter(System.err);
//    try {
//      // 1. Create temp file
//      Path tempFile = Files.createTempFile("cap-test-", ".cap");
//
//      // 2. Write annotation to file
//      Files.writeString(tempFile, annotation);
//
//      // 3. Parse via existing compiler
//      ASTInterface astInterface =
//          CAPCompiler.compileSpecification(tempFile.toString(), err);
//
//      if (astInterface != null) {
//        ASTPrinter.print(astInterface);
//      }
//      System.out.println("==============================");
//
////      CAPToOCLVisitor capToOCLVisitor = new CAPToOCLVisitor();
////      String ocl = capToOCLVisitor.visitSumConstraint(astInterface);
////
////      System.out.println(ocl);
//
//      // 4. Optional: delete temp file
//      Files.deleteIfExists(tempFile);
//
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    CapParserView parserView = new CapParserView();
    ViewFrame frame = new ViewFrame(
        "CAP Annotation to OCL Converter",
        parserView,
        "CommunicationDiagram.gif"
    );

    parserView.setFrame(frame);
    JComponent content = (JComponent) frame.getContentPane();
    content.setLayout(new BorderLayout());
    content.add(parserView, BorderLayout.CENTER);

    MainWindow.instance().addNewViewFrame(frame);
    setMaximumFrameSize(frame);
  }


  private void openManageCap() {
    CapManageView capManageView = new CapManageView();

    ViewFrame frame = new ViewFrame(
        "Manage CAP",
        capManageView,
        "CommunicationDiagram.gif"
    );

    // link CapView with its ViewFrame
    // required for going back to CRUD view
    capManageView.setFrame(frame);

    // compose frame content
    // add CapView to frame content pane
    JComponent content = (JComponent) frame.getContentPane();
    content.setLayout(new BorderLayout());
    content.add(capManageView, BorderLayout.CENTER);

    MainWindow.instance().addNewViewFrame(frame);
    setMaximumFrameSize(frame);
  }

  // open Create CAP view in new ViewFrame
  private void openCreateCap() {
    CapCreateView capView = new CapCreateView();

    ViewFrame frame = new ViewFrame(
        "Create CAP",
        capView,
        "CommunicationDiagram.gif"
    );

    // link CapView with its ViewFrame
    // required for going back to CRUD view
    capView.setFrame(frame);

    // compose frame content
    // add CapView to frame content pane
    JComponent content = (JComponent) frame.getContentPane();
    content.setLayout(new BorderLayout());
    content.add(capView, BorderLayout.CENTER);

    MainWindow.instance().addNewViewFrame(frame);
    setMaximumFrameSize(frame);
  }


  @Override
  public void detachModel() {
    // nothing to detach
  }
}