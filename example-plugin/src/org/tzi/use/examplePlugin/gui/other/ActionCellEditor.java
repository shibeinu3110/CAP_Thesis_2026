package org.tzi.use.examplePlugin.gui.other;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

// This class is to handle the edit, delete, open and show types action when user clicks the corresponding button in the table cell. It will call the corresponding function passed from CapManagePanel to perform the action, and then stop editing to close the cell editor. The showTypes function is a QuadConsumer that takes capName, table, row and button as parameters, which is used to show the popup menu for showing types when user clicks the "Show Types" button.
// by default, the cell does not allow editing, so we need to override the isCellEditable method in the table model to return true for the action column, and return false for other columns. This way, only the action column can be edited (clicked), and other columns are not editable.

public class ActionCellEditor extends AbstractCellEditor
    implements TableCellEditor {

  private final ActionCellPanel panel = new ActionCellPanel();
  private String capName;

  private int row;
  private QuadConsumer<String, JTable, Integer, JButton> showTypes;
  private JTable table;

  public ActionCellEditor(
      Consumer<String> open,
      Consumer<String> edit,
      Consumer<String> delete,
      QuadConsumer<String, JTable, Integer, JButton> showTypes) {

    panel.openBtn.addActionListener(e -> {
      open.accept(capName);
      stopCellEditing();
    });

    panel.editBtn.addActionListener(e -> {
      edit.accept(capName);
      stopCellEditing();
    });

    panel.deleteBtn.addActionListener(e -> {
      delete.accept(capName);
      stopCellEditing();
    });

    panel.typesBtn.addActionListener(e -> {
      JButton btn = (JButton) e.getSource();
      JTable table = (JTable) SwingUtilities.getAncestorOfClass(JTable.class, btn);

      int row = table.getEditingRow();

      showTypes.accept(capName, table, row, btn);
      stopCellEditing();
    });
  }

  // get the current capName from the first column of the table, and set the background color of the panel to the selection background color of the table when the cell is being edited (clicked). This way, we can know which CAP is being edited (clicked) and show the corresponding actions in the panel.
  @Override
  public Component getTableCellEditorComponent(
      JTable table, Object value,
      boolean isSelected, int row, int column) {

    capName = table.getValueAt(row, 0).toString();
    panel.setBackground(table.getSelectionBackground());
    return panel;
  }

  @Override
  public Object getCellEditorValue() {
    return capName;
  }
}
