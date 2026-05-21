package org.tzi.use.useCap.metamodel.prerequisite_constraint.type10;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType10 implements PrerequisiteConstraintInterface {
  String assocCls;
  String checkedRole;
  String rolePath;

  List<AttrCondPro> requireExists;
}
