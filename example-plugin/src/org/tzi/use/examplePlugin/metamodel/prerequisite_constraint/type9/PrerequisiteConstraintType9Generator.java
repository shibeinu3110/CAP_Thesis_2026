package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type9;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;

public class PrerequisiteConstraintType9Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType9> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType9 pr9) {

    System.out.println("Generating PrerequisiteConstraintType9...");

    String closureIte = String.valueOf(pr9.checkedRole.charAt(0));

    return """
    context %s
    inv %s:
      self.%s -> closure(%s | %s.%s) -> size() <= %d
    """.formatted(
        contextClass,
        invariantName,
        pr9.checkedRole,
        closureIte,
        closureIte,
        pr9.checkedRole,
        pr9.maxDepthLimit
    );
  }
}
