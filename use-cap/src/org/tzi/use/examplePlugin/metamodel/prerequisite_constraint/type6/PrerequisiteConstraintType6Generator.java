package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type6;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;

public class PrerequisiteConstraintType6Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType6> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType6 pr7) {

    System.out.println("Generating PrerequisiteConstraintType7...");

    return """
    context %s
    inv %s:
      not self.%s -> includes(self)
    """.formatted(
        contextClass,
        invariantName,
        pr7.checkedRole
    );
  }
}
