package org.tzi.use.useCap.metamodel.status_constraint;

import org.tzi.use.useCap.ast.ASTInterface;

import java.util.Map;

public class StatusConstraintExecutor {
  public static String execute(
      ASTInterface astInterface,
      Map<String, Object> astJson,
      String context,
      String name
  ) {
    StatusConstraintDetector sizeConstraintDetector = new StatusConstraintDetector();
    StatusConstraintType type =
        sizeConstraintDetector.detectType(astInterface);

    StatusConstraintInterface model =
        type.parser().parse(astJson);

    return type.generator()
        .generate(context, name, model);
  }
}
