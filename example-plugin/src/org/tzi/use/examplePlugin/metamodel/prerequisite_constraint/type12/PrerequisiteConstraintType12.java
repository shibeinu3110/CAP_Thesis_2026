package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type12;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType12 implements PrerequisiteConstraintInterface {
  String assocCls;
  String rolePath;

  List<IfPart> ifParts;
  List<AttrCondPro> requires;
}
