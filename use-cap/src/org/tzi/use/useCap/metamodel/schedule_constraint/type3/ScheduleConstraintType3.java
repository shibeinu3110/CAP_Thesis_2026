package org.tzi.use.useCap.metamodel.schedule_constraint.type3;

import org.tzi.use.useCap.metamodel.TimeWindow;
import org.tzi.use.useCap.metamodel.schedule_constraint.ScheduleConstraintInterface;

public class ScheduleConstraintType3 implements ScheduleConstraintInterface {

  String assocCls;
  String rolePath;

  public TimeWindow window;

  public LimitAttribute limitAttribute;
}
