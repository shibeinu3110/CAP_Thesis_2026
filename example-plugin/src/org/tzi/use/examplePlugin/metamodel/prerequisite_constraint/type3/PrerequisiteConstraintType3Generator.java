package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;

import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildAllowedCondition;

public class PrerequisiteConstraintType3Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType3> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType3 pr3) {

    System.out.println("Generating PrerequisiteConstraintType3...");

    String firstRolePath = pr3.rolePath.concat(".").concat(pr3.checkedRole);

    String refAttr = pr3.requires.get(0).refAttr;

    // inside forAll part
    String insideForAll = buildAllowedCondition(pr3.requires, RootScope.LAST_ONLY, refAttr, false);

    System.out.println("Generated inside forAll condition:\n" + insideForAll);


    return """
    context %s
    inv %s:
      self.%s->forAll(e | 
        e.%s->forAll(%s | 
          %s
        )
      )
    """.formatted(
        contextClass,
        invariantName,
        pr3.assocCls,
        firstRolePath,   // e.course.prerequisites
        refAttr,         // p
        insideForAll     // the condition inside the forAll, e.g., p.course = e.course
    );
  }
}
