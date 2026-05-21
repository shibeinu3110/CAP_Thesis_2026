package org.tzi.use.useCap.metamodel.prerequisite_constraint.type2;

import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;

public class PrerequisiteConstraintType2Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType2> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType2 pr2) {

    System.out.println("Generating PrerequisiteConstraintType2...");

    String firstRolePath = pr2.rolePath.concat(".").concat(pr2.checkedRole);

    return """
        context %s
        inv %s:
          self.%s->forAll(e1, e2 | e1.%s -> excludes(e2.%s))
        """.formatted(
        contextClass,
        invariantName,
        pr2.assocCls,
        firstRolePath,
        pr2.rolePath
    );
  }
}
