package org.tzi.use.examplePlugin.metamodel.schedule_constraint.type4;

import org.tzi.use.examplePlugin.metamodel.TimeWindow;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.ScheduleConstraintInterface;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type3.LimitAttribute;

public class ScheduleConstraintType4 implements ScheduleConstraintInterface {

  String targetAttr;
  LimitAttribute limitAttribute;
}
