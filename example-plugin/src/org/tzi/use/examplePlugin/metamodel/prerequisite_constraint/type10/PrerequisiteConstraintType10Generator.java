package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type10;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;
import org.tzi.use.examplePlugin.util.GeneratorUtils;

public class PrerequisiteConstraintType10Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType10> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType10 pr10) {

    System.out.println("Generating PrerequisiteConstraintType10...");

    String existsExpr =
        GeneratorUtils.buildExistsCheckCondition(
            pr10.assocCls,
            pr10.requireExists,
            "e2"
        );

    String ite = String.valueOf(pr10.assocCls.charAt(0)).toLowerCase();

    String ite2 = String.valueOf(pr10.checkedRole.charAt(0)).toLowerCase();

    return """
      context %s
      inv %s:
        self.%s->forAll(%s |
          %s.%s.%s->forAll(%s |
            %s
          )
        )
      """.formatted(
        contextClass,
        invariantName,
        pr10.assocCls,
        ite,
        ite,
        pr10.rolePath,
        pr10.checkedRole,
        ite2,
        existsExpr
    );
  }
}
