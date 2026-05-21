package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type12;

import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;
import org.tzi.use.examplePlugin.util.GeneratorUtils;

import java.util.HashSet;
import java.util.Set;

public class PrerequisiteConstraintType12Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType12> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType12 pr12) {

    System.out.println("Generating PrerequisiteConstraintType12...");

    String e = pickIterator(pr12.assocCls, new HashSet<>());

    // if part
    String ifCond = GeneratorUtils.buildIfCondition(pr12.ifParts, e);

    // require part
    String requireCond = GeneratorUtils.buildAllowedCondition(
        pr12.requires,
        RootScope.ALL,
        null,
        false
    );

    String finalCond;

    if (ifCond != null && !ifCond.isBlank()) {
      finalCond = ifCond + " implies " + requireCond;
    } else {
      finalCond = requireCond;
    }

    return """
    context %s
    inv %s:
      self.%s->forAll(%s |
        %s
      )
    """.formatted(
        contextClass,
        invariantName,
        pr12.assocCls,
        e,
        finalCond
    );
  }

  private String pickIterator(String base, Set<String> used) {
    String prefix = base.substring(0,1).toLowerCase();
    String candidate = prefix;
    int i = 1;

    while (used.contains(candidate)) {
      candidate = prefix + i++;
    }

    used.add(candidate);
    return candidate;
  }
}
