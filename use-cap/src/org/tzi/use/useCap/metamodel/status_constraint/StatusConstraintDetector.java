package org.tzi.use.useCap.metamodel.status_constraint;

import org.tzi.use.useCap.ast.ASTInterface;
import org.tzi.use.useCap.logic.ConstraintHandler;

import java.util.List;
import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.IF_PART;
import static org.tzi.use.useCap.util.CommonComparationsAttributes.COLLECT;
import static org.tzi.use.useCap.util.UseUtils.hasKeyIn;
import static org.tzi.use.useCap.util.UseUtils.hasSpecificKey;

public class StatusConstraintDetector implements ConstraintHandler {
  private static final String CAL_SIZE = "calSize";
  /**
   * Currently, we have 5 types of size constraints.
   * However, the type 1 generator and parser are made abstract enough to use for both type 1 and 2
   *
   * Type 5 is still under development as we need to confirm the requirements.
   * @param astInterface
   * @return
   */
  public StatusConstraintType detectType(ASTInterface astInterface) {

    if (!hasSpecificKey(astInterface, COLLECT) && !hasKeyIn(astInterface, List.of(CAL_SIZE), IF_PART)) {
      return StatusConstraintType.TYPE1;
    } else if (hasSpecificKey(astInterface, COLLECT)) {
      return StatusConstraintType.TYPE3;
    } else if (hasKeyIn(astInterface, List.of(CAL_SIZE), IF_PART)) {
      return StatusConstraintType.TYPE5;
    }
    // Placeholder implementation
    return StatusConstraintType.UNSUPPORTED;
  }

  @Override
  public String detect(ASTInterface ast) {
    StatusConstraintType type =
        new StatusConstraintDetector().detectType(ast);
    return "StatusConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return StatusConstraintExecutor.execute(ast, json, context, name);
  }
}
