package org.tzi.use.useCap.metamodel.schedule_constraint;

import org.tzi.use.useCap.ast.ASTInterface;

import java.util.Map;

public class ScheduleConstraintExecutor {
  public static String execute(
      ASTInterface astInterface,
      Map<String, Object> astJson,
      String context,
      String name
  ) {
    ScheduleConstraintDetector scheduleConstraintDetector = new ScheduleConstraintDetector();
    ScheduleConstraintType type =
        scheduleConstraintDetector.detectType(astInterface);

    ScheduleConstraintInterface model =
        type.parser().parse(astJson);

    return type.generator()
        .generate(context, name, model);
  }
}
