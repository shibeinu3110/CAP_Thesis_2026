package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type10;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType10 implements PrerequisiteConstraintInterface {
  String assocCls;
  String checkedRole;
  String rolePath;

  List<AttrCondPro> requireExists;
}
