package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type7;

import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;

import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildAllowedCondition;

public class PrerequisiteConstraintType7Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType7> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType7 pr7) {

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
