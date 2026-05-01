package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;

import java.util.Map;

public class PrerequisiteConstraintExecutor {
  public static String execute(
      ASTInterface astInterface,
      Map<String, Object> astJson,
      String context,
      String name
  ) {
    PrerequisiteConstraintDetector prerequisiteConstraintDetector = new PrerequisiteConstraintDetector();
    PrerequisiteConstraintType type =
        prerequisiteConstraintDetector.detectType(astInterface);

    PrerequisiteConstraintInterface model =
        type.parser().parse(astJson);

    return type.generator()
        .generate(context, name, model);
  }
}
