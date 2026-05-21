package org.tzi.use.useCap.metamodel.sumproduct_constraint;

import org.tzi.use.useCap.ast.ASTInterface;

import java.util.Map;

public class SumProductConstraintExecutor {
  public static String execute(
      ASTInterface astInterface,
      Map<String, Object> astJson,
      String context,
      String name
  ) {
    SumProductConstraintDetector sumProductConstraintDetector = new SumProductConstraintDetector();
    SumProductConstraintType type =
        sumProductConstraintDetector.detectType(astInterface);

    SumProductConstraintInterface model =
        type.parser().parse(astJson);

    return type.generator()
        .generate(context, name, model);
  }
}
