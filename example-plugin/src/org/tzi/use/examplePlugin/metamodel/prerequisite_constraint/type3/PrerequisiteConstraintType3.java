package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType3 implements PrerequisiteConstraintInterface {
  String assocCls;
  String rolePath;
  String checkedRole;

  List<AttrCondPro> requires;

}
