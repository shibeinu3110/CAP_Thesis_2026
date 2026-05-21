package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type5;

import org.tzi.use.examplePlugin.metamodel.RelationCond;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintInterface;

import java.util.List;

public class PrerequisiteConstraintType5 implements PrerequisiteConstraintInterface {
  public String assocCls;      // enrolments
  public String rolePath;      // course
  public String checkedRole;   // corequisites

  public List<RelationCond> relations;
}
