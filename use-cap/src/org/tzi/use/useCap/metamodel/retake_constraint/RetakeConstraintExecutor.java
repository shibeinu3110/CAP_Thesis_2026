package org.tzi.use.useCap.metamodel.retake_constraint;

import org.tzi.use.useCap.ast.ASTInterface;

import java.util.Map;

public class RetakeConstraintExecutor {
  public static String execute(
      ASTInterface astInterface,
      Map<String, Object> astJson,
      String context,
      String name
  ) {
    RetakeConstraintDetector sizeConstraintDetector = new RetakeConstraintDetector();
    RetakeConstraintType type =
        sizeConstraintDetector.detectType(astInterface);

    RetakeConstraintInterface model =
        type.parser().parse(astJson);

    return type.generator()
        .generate(context, name, model);
  }
}
