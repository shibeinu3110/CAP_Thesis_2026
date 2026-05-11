package org.tzi.use.examplePlugin.metamodel.schedule_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;
import org.tzi.use.examplePlugin.logic.ConstraintHandler;
import org.tzi.use.examplePlugin.metamodel.OperatorEnum;

import java.util.Arrays;
import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ALT_PART;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECK_FOR_EXI;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CONFLICT_CHECK;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CROSS_REFERENCE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.INTERSECTION_OP;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.TARGET_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.WINDOW;
import static org.tzi.use.examplePlugin.util.UseUtils.hasSpecificKey;

public class ScheduleConstraintDetector implements ConstraintHandler {
  public ScheduleConstraintType detectType(ASTInterface astInterface) {
    if (hasSpecificKey(astInterface, CROSS_REFERENCE)
        && hasSpecificKey(astInterface, CONFLICT_CHECK)
        && hasSpecificKey(astInterface, INTERSECTION_OP)
        && hasSpecificKey(astInterface, MAX)) {
      return ScheduleConstraintType.TYPE1;
    } else if (hasSpecificKey(astInterface, CHECK_FOR_EXI) && hasSpecificKey(astInterface, ALT_PART)) {
      return ScheduleConstraintType.TYPE2;
    } else if (hasSpecificKey(astInterface, WINDOW)) {
      return ScheduleConstraintType.TYPE3;
    } else if (hasSpecificKey(astInterface, TARGET_ATTR)) {
      if (Arrays.stream(OperatorEnum.values()).map(OperatorEnum::getName).anyMatch(op -> hasSpecificKey(astInterface, op))) {
        return ScheduleConstraintType.TYPE4;
      }
    }
    // Placeholder implementation
    return ScheduleConstraintType.UNSUPPORTED;
  }

  @Override
  public String detect(ASTInterface ast) {
    ScheduleConstraintType type =
        new ScheduleConstraintDetector().detectType(ast);
    return "ScheduleConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return ScheduleConstraintExecutor.execute(ast, json, context, name);
  }
}
