package org.tzi.use.examplePlugin.metamodel.structural_constraint.type4;

import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildAllowedCondition;

public class StructuralConstraintType4Generator implements StructuralConstraintGenerator<StructuralConstraintType4> {
  @Override
  public String generate(String contextClass, String invariantName, StructuralConstraintType4 sc4) {

    System.out.println("Generating StructuralConstraintType4...");

    return """
        context %s inv %s:
          self.%s -> isUnique(%s | %s.%s)
        """.formatted(
        contextClass,
        invariantName,
        sc4.targetAssoc,
        extractFirstChar(sc4.targetAssoc),
        extractFirstChar(sc4.targetAssoc),
        sc4.rolePath

    );
  }

  private String extractFirstChar(String targetAssoc) {
    return targetAssoc.substring(0, 1).toLowerCase();
  }
}
