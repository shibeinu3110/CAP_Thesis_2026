package org.tzi.use.useCap.metamodel.structural_constraint;

import org.tzi.use.useCap.ast.ASTInterface;

import java.util.Map;

public class StructuralConstraintExecutor {
  public static String execute(
      ASTInterface astInterface,
      Map<String, Object> astJson,
      String context,
      String name
  ) {
    StructuralConstraintDetector sizeConstraintDetector = new StructuralConstraintDetector();
    StructuralConstraintType type =
        sizeConstraintDetector.detectType(astInterface);

    StructuralConstraintInterface model =
        type.parser().parse(astJson);

    return type.generator()
        .generate(context, name, model);
  }
}
