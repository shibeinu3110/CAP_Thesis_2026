package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type2;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType2 implements PrerequisiteConstraintInterface {
  String assocCls;
  String rolePath;
  String targetAssoc;

  List<AttrCondPro> filters;
  String sumAttr;
  Integer max;
}
