package org.tzi.use.examplePlugin.metamodel.structural_constraint.type1;

import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildAllowedCondition;

public class StructuralConstraintType1Generator implements StructuralConstraintGenerator<StructuralConstraintType1> {
  @Override
  public String generate(String contextClass, String invariantName, StructuralConstraintType1 sc1) {

    System.out.println("Generating StructuralConstraintType1...");


    String checkStructure = buildAllowedCondition(sc1.checkStructure, null, null);

    // split into [A=1, and, B=2, or, C=3]
    List<String> tokens = Arrays.stream(checkStructure.split("(?<=\\s)(and|or)(?=\\s)|\\s+(?=and|or)|(?<=and|or)\\s+"))
        .filter(s -> !s.isBlank())
        .collect(Collectors.toList());

    String result = tokens.stream()
        .map(t -> t.equals("and") || t.equals("or") ? t : sc1.rolePath + "." + t)
        .collect(Collectors.joining(" "));

    System.out.println(result);


    return """
        context %s inv %s:
          %s
        """.formatted(
        contextClass,
        invariantName,
        result
    );
  }
}
