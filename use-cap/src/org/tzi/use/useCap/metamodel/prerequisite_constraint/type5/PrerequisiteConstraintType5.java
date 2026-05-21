package org.tzi.use.useCap.metamodel.prerequisite_constraint.type5;

import org.tzi.use.useCap.metamodel.RelationCond;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType5 implements PrerequisiteConstraintInterface {
  public String assocCls;      // enrolments
  public String rolePath;      // course
  public String checkedRole;   // corequisites

  public List<RelationCond> relations;
}
