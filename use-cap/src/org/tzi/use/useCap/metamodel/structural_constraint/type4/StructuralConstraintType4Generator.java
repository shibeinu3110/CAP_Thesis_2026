package org.tzi.use.useCap.metamodel.structural_constraint.type4;

import org.tzi.use.useCap.metamodel.structural_constraint.StructuralConstraintGenerator;

public class StructuralConstraintType4Generator implements StructuralConstraintGenerator<StructuralConstraintType4> {
  @Override
  public String generate(String contextClass, String invariantName, StructuralConstraintType4 sc4) {

    System.out.println("Generating StructuralConstraintType4...");

    if(sc4.targetAssoc == null || sc4.targetAssoc.isEmpty() || sc4.rolePath == null || sc4.rolePath.isEmpty()) {
      throw new IllegalArgumentException("StructuralConstraintType4 requires non-empty targetAssoc and rolePath");
    }

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
