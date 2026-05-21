package org.tzi.use.useCap.metamodel.size_constraint;

import org.tzi.use.useCap.ast.ASTInterface;

import java.util.Map;

public class SizeConstraintExecutor {
  public static String execute(
      ASTInterface astInterface,
      Map<String, Object> astJson,
      String context,
      String name
  ) {
    SizeConstraintDetector sizeConstraintDetector = new SizeConstraintDetector();
    SizeConstraintType type =
        sizeConstraintDetector.detectType(astInterface);

    SizeConstraintInterface model =
        type.parser().parse(astJson);

    return type.generator()
        .generate(context, name, model);
  }
}
