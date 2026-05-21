package org.tzi.use.useCap.metamodel.time_constraint;

import org.tzi.use.useCap.CaculatorEnum;
import org.tzi.use.useCap.ast.ASTInterface;
import org.tzi.use.useCap.logic.ConstraintHandler;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.IF_PART;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.MAX;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.SUM_ATTR;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.WINDOW;
import static org.tzi.use.useCap.util.UseUtils.hasKeyIn;
import static org.tzi.use.useCap.util.UseUtils.hasKeyInCheckForExi;
import static org.tzi.use.useCap.util.UseUtils.hasSpecificKey;

public class TimeConstraintDetector implements ConstraintHandler {
  public TimeConstraintType detectType(ASTInterface astInterface) {

    List<String> keys = Arrays.stream(CaculatorEnum.values())
        .map(e -> e.name().toLowerCase())
        .toList();

    if (!hasKeyInCheckForExi(astInterface, keys) && !hasKeyIn(astInterface, keys, IF_PART) && !(hasSpecificKey(astInterface, MAX) && hasSpecificKey(astInterface, SUM_ATTR))) {
      return TimeConstraintType.TYPE1;
    } else if (hasKeyInCheckForExi(astInterface, keys)) {
      // type 2, 3, 5 is the same, so we only need to use 1 parser and generator for both of them
      return TimeConstraintType.TYPE2;
    } else if (hasKeyIn(astInterface, keys, IF_PART)) {
      return TimeConstraintType.TYPE4;
    } else if (hasSpecificKey(astInterface, WINDOW)) {
      return TimeConstraintType.TYPE3;
    } else if (hasSpecificKey(astInterface, MAX) && hasSpecificKey(astInterface, SUM_ATTR)) {
      return TimeConstraintType.TYPE5;

    }
    // Placeholder implementation
    return TimeConstraintType.UNSUPPORTED;
  }
  @Override
  public String detect(ASTInterface ast) {
    TimeConstraintType type =
        new TimeConstraintDetector().detectType(ast);
    return "TimeConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return TimeConstraintExecutor.execute(ast, json, context, name);
  }
}
