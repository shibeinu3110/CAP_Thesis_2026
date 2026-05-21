package org.tzi.use.useCap.metamodel.schedule_constraint;

import org.tzi.use.useCap.ast.ASTInterface;
import org.tzi.use.useCap.logic.ConstraintHandler;
import org.tzi.use.useCap.metamodel.OperatorEnum;

import java.util.Arrays;
import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ALT_PART;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECK_FOR_EXI;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CONFLICT_CHECK;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CROSS_REFERENCE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.INTERSECTION_OP;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.MAX;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.TARGET_ATTR;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.WINDOW;
import static org.tzi.use.useCap.util.UseUtils.hasSpecificKey;

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
