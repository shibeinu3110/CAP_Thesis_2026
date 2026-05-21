package org.tzi.use.useCap.metamodel.prerequisite_constraint.type3;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType3 implements PrerequisiteConstraintInterface {
  String assocCls;
  String rolePath;
  String checkedRole;

  List<AttrCondPro> requires;

}
