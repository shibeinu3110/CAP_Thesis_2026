package org.tzi.use.useCap.metamodel.schedule_constraint.type1;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.schedule_constraint.ScheduleConstraintInterface;

import java.util.List;

public class ScheduleConstraintType1 implements ScheduleConstraintInterface {

  String assocCls;
  String targetAssoc;
  String rolePath;

  public List<AttrCondPro> filters;

  boolean crossReference;
  String conflictCheck;
  String intersectionOp;
  int max;
}
