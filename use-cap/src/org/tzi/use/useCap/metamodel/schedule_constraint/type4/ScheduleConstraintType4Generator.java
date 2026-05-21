package org.tzi.use.useCap.metamodel.schedule_constraint.type4;

import org.tzi.use.useCap.metamodel.schedule_constraint.ScheduleConstraintGenerator;

public class ScheduleConstraintType4Generator implements ScheduleConstraintGenerator<ScheduleConstraintType4> {
  @Override
  public String generate(String contextClass, String invariantName, ScheduleConstraintType4 sc4) {
    System.out.println("Generating ScheduleConstraintType4...");

    return """
        context %sr
        inv %s:
          self.%s %s %s
        """.formatted(
        contextClass,
        invariantName,
        sc4.targetAttr,
        sc4.limitAttribute.operator.symbol,
        sc4.limitAttribute.value
    );
  }
}
