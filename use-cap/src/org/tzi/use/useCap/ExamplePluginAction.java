package org.tzi.use.useCap;

import org.tzi.use.useCap.gui.CapCrudView;
import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.gui.main.ViewFrame;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;

import javax.swing.*;
import java.awt.*;

import static org.tzi.use.useCap.util.GUIUtils.setMaximumFrameSize;

public class ExamplePluginAction implements IPluginActionDelegate {
  @Override
  public void performAction(IPluginAction pluginAction) {

    // 1. Open a USE model file
    System.out.println("Example Plugin Action: performAction called");

    CapCrudView capCrudView = new CapCrudView();

    ViewFrame frame = new ViewFrame(
        "CAP Creator",
        capCrudView,
        "CommunicationDiagram.gif"
    );

    JComponent content = (JComponent) frame.getContentPane();
    content.setLayout(new BorderLayout());
    content.add(capCrudView, BorderLayout.CENTER);

    MainWindow.instance().addNewViewFrame(frame);
    setMaximumFrameSize(frame);
  }
}
