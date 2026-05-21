package org.tzi.use.useCap.metamodel.size_constraint;

import org.tzi.use.useCap.ast.ASTInterface;
import org.tzi.use.useCap.logic.ConstraintHandler;

import java.util.Map;

public class SizeConstraintDetector implements ConstraintHandler {
  /**
   * Currently, we have 5 types of size constraints.
   * However, the type 1 generator and parser are made abstract enough to use for both type 1 to 4
   *
   * Type 5 is still under development as we need to confirm the requirements.
   * @param astInterface
   * @return
   */
  public SizeConstraintType detectType(ASTInterface astInterface) {
    if (true) {
      return SizeConstraintType.TYPE1;
    }
    // Placeholder implementation
    return SizeConstraintType.UNSUPPORTED;
  }

  @Override
  public String detect(ASTInterface ast) {
    SizeConstraintType type =
        new SizeConstraintDetector().detectType(ast);
    return "SizeConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return SizeConstraintExecutor.execute(ast, json, context, name);
  }
}
