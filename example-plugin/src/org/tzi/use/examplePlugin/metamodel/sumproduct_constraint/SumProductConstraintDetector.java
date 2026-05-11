package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;
import org.tzi.use.examplePlugin.logic.ConstraintHandler;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CACU;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.SUM_ATTR1;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.SUM_ATTR2;
import static org.tzi.use.examplePlugin.util.UseUtils.hasSpecificKey;

public class SumProductConstraintDetector implements ConstraintHandler {
  public SumProductConstraintType detectType(ASTInterface astInterface) {

      if (hasSpecificKey(astInterface, SUM_ATTR1)
        && hasSpecificKey(astInterface, SUM_ATTR2)) {
        return SumProductConstraintType.TYPE1;
      } else if (hasSpecificKey(astInterface, CACU)) {
        return SumProductConstraintType.TYPE2;
      } else if (hasSpecificKey(astInterface, SUM_ATTR)) {
        return SumProductConstraintType.TYPE3;
      }

    // Placeholder implementation
    return SumProductConstraintType.UNSUPPORTED;
  }

  @Override
  public String detect(ASTInterface ast) {
    SumProductConstraintType type =
        new SumProductConstraintDetector().detectType(ast);
    return "SumProductConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return SumProductConstraintExecutor.execute(ast, json, context, name);
  }
}
