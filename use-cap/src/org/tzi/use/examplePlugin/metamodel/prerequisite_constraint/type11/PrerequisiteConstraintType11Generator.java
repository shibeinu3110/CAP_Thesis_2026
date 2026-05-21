package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type11;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;
import org.tzi.use.examplePlugin.util.GeneratorUtils;

import java.util.HashSet;
import java.util.Set;

public class PrerequisiteConstraintType11Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType11> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType11 pr11) {

    System.out.println("Generating PrerequisiteConstraintType11...");

    Set<String> used = new HashSet<>();
    String firstVar = pickIterator(pr11.assocCls, used); // firstVar
    String secondVar = pickIterator(pr11.assocCls, used); // secondVar

    String leftPath  = firstVar + "." + pr11.rolePath + "." + pr11.checkedRole;
    String rightPath = secondVar + "." + pr11.rolePath;

    String condition =
        "not (" +
            leftPath +
            "->includes(" +
            rightPath +
            "))";

    return """
    context %s
    inv %s:
      self.%s->forAll(%s, %s |
        %s
      )
    """.formatted(
        contextClass,
        invariantName,
        pr11.assocCls,
        firstVar,
        secondVar,
        condition
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
