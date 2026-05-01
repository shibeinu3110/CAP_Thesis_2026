package org.tzi.use.examplePlugin.metamodel.retake_constraint.type4;

import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintGenerator;
import org.tzi.use.examplePlugin.util.GeneratorUtils;

import static org.tzi.use.examplePlugin.util.GeneratorUtilsV2.buildAllowedConditionForRetake;

public class RetakeConstraintType4Generator implements RetakeConstraintGenerator<RetakeConstraintType4> {
  @Override
  public String generate(String contextClass, String invariantName, RetakeConstraintType4 rc4) {

    System.out.println("Generating RetakeConstraintType4...");
    System.out.println("If parts: " + GeneratorUtils.buildIfCondition(rc4.ifParts, null));
    System.out.println("Check for existence: " + GeneratorUtils.buildExistsCheckCondition(rc4.targetAssoc, rc4.checkForExi));
    System.out.println("Check for existence2: " + GeneratorUtils.buildExistsCheckCondition(rc4.targetAssoc, rc4.checkForExi2));

    return """
        context %s 
        inv %s:
          %s implies
          (
            %s
            or
            %s
          )
        """.formatted(
        contextClass,
        invariantName,
        GeneratorUtils.buildIfCondition(rc4.ifParts, null),
        GeneratorUtils.buildExistsCheckCondition(rc4.targetAssoc, rc4.checkForExi),
        GeneratorUtils.buildExistsCheckCondition(rc4.targetAssoc, rc4.checkForExi2));
  }
}
