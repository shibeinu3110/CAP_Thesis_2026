package org.tzi.use.examplePlugin.gui.other;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.util.function.Consumer;

public class ActionCellEditor extends AbstractCellEditor
    implements TableCellEditor {

  private final ActionCellPanel panel = new ActionCellPanel();
  private String capName;

  public ActionCellEditor(
      Consumer<String> open,
      Consumer<String> edit,
      Consumer<String> delete) {

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
  }

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
