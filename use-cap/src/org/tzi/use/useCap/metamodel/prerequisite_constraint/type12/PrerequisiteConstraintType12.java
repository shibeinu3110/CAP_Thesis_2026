package org.tzi.use.useCap.metamodel.prerequisite_constraint.type12;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType12 implements PrerequisiteConstraintInterface {
  String assocCls;
  String rolePath;

  List<IfPart> ifParts;
  List<AttrCondPro> requires;
}
