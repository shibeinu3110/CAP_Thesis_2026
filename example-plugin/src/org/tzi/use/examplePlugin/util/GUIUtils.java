package org.tzi.use.examplePlugin.util;

import org.tzi.use.gui.main.ViewFrame;

import javax.swing.*;
import java.awt.*;


public class GUIUtils extends JPanel {

  public static void setMaximumFrameSize(ViewFrame frame) {
    try {
      frame.setMaximum(true);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void showErrorDialog(Component parent, String message) {
    JDialog dialog = new JDialog(
        SwingUtilities.getWindowAncestor(parent),
        "Error",
        Dialog.ModalityType.APPLICATION_MODAL
    );

    JPanel root = new JPanel(new BorderLayout(12, 12));
    root.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));
    root.setBackground(Color.WHITE);

    // ICON
    JLabel icon = new JLabel(UIManager.getIcon("OptionPane.errorIcon"));
    root.add(icon, BorderLayout.WEST);

    // MESSAGE
    JLabel msg = new JLabel("<html>" + message + "</html>");
    msg.setFont(new Font("Segoe UI", Font.PLAIN, 13));
    root.add(msg, BorderLayout.CENTER);

    // BUTTON
    JButton ok = new JButton("OK");
    ok.setFocusPainted(false);
    ok.addActionListener(e -> dialog.dispose());

    JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    btnPanel.setOpaque(false);
    btnPanel.add(ok);

    root.add(btnPanel, BorderLayout.SOUTH);

    dialog.setContentPane(root);
    dialog.pack();
    dialog.setLocationRelativeTo(parent);
    dialog.setResizable(false);
    dialog.setVisible(true);
  }

  public static JPanel createCardButton(
      String title,
      String description,
      Icon icon,
      Runnable action
  ) {
    JPanel card = new JPanel(new BorderLayout(10, 10));
    card.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.LIGHT_GRAY),
        BorderFactory.createEmptyBorder(15, 15, 15, 15)
    ));
    card.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    JLabel titleLabel = new JLabel(title);
    titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 16f));

    JLabel descLabel = new JLabel("<html><i>" + description + "</i></html>");

    JLabel iconLabel = new JLabel(icon);
    iconLabel.setHorizontalAlignment(SwingConstants.CENTER);

    JPanel textPanel = new JPanel(new BorderLayout(5, 5));
    textPanel.add(titleLabel, BorderLayout.NORTH);
    textPanel.add(descLabel, BorderLayout.CENTER);

    card.add(iconLabel, BorderLayout.WEST);
    card.add(textPanel, BorderLayout.CENTER);

    card.addMouseListener(new java.awt.event.MouseAdapter() {
      @Override
      public void mouseClicked(java.awt.event.MouseEvent e) {
        action.run();
      }
    });

    return card;
  }

  public static JButton createFlatButton(String text) {
    JButton btn = new JButton(text);
    btn.setFocusPainted(false);
    btn.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));
    btn.setBackground(new Color(245, 245, 245));
    btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    btn.setMargin(new Insets(2, 10, 2, 10));
    return btn;
  }

}
