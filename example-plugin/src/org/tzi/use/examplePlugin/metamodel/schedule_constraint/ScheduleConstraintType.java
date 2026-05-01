package org.tzi.use.examplePlugin.metamodel.schedule_constraint;

import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type1.ScheduleConstraintType1Generator;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type1.ScheduleConstraintType1Parser;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type2.ScheduleConstraintType2Generator;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type2.ScheduleConstraintType2Parser;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type3.ScheduleConstraintType3Generator;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type3.ScheduleConstraintType3Parser;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type4.ScheduleConstraintType4Generator;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type4.ScheduleConstraintType4Parser;

public enum ScheduleConstraintType {
  TYPE1(new ScheduleConstraintType1Parser(), new ScheduleConstraintType1Generator()),
  TYPE2(new ScheduleConstraintType2Parser(), new ScheduleConstraintType2Generator()),
  TYPE3(new ScheduleConstraintType3Parser(), new ScheduleConstraintType3Generator()),
  TYPE4(new ScheduleConstraintType4Parser(), new ScheduleConstraintType4Generator()),
  UNSUPPORTED(null, null);

  public final ScheduleConstraintParser<?> parser;
  public final ScheduleConstraintGenerator<?> generator;

  ScheduleConstraintType(
      ScheduleConstraintParser<? extends ScheduleConstraintInterface> parser,
      ScheduleConstraintGenerator<? extends ScheduleConstraintInterface> generator
  ) {
    this.parser = parser;
    this.generator = generator;
  }

  @SuppressWarnings("unchecked")
  public <T extends ScheduleConstraintInterface> ScheduleConstraintParser<T> parser() {
    return (ScheduleConstraintParser<T>) parser;
  }

  @SuppressWarnings("unchecked")
  public <T extends ScheduleConstraintInterface> ScheduleConstraintGenerator<T> generator() {
    return (ScheduleConstraintGenerator<T>) generator;
  }
}
