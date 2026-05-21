package org.tzi.use.useCap.metamodel.structural_constraint.type2;

import org.tzi.use.useCap.metamodel.structural_constraint.StructuralConstraintGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.tzi.use.useCap.util.GeneratorUtils.buildAllowedCondition;

public class StructuralConstraintType2Generator implements StructuralConstraintGenerator<StructuralConstraintType2> {
  @Override
  public String generate(String contextClass, String invariantName, StructuralConstraintType2 sc2) {

    System.out.println("Generating StructuralConstraintType2...");


    String checkStructure = buildAllowedCondition(sc2.checkStructure, null, null, false);
    System.out.println("Generated checkStructure condition: " + checkStructure);

    // split into [A=1, and, B=2, or, C=3]
    List<String> tokens = Arrays.stream(
            checkStructure.split("(?<=\\b(and|or)\\b)|(?=\\b(and|or)\\b)")
        )
        .map(String::trim)
        .filter(s -> !s.isBlank())
        .collect(Collectors.toList());

    tokens.stream().forEach(t -> System.out.println("Token: '" + t + "'"));

    String result = tokens.stream()
        .map(t -> {
          if (t.equalsIgnoreCase("and") || t.equalsIgnoreCase("or")) return t;
          if (t.startsWith(sc2.rolePath + ".")) return t;
          return sc2.rolePath + "." + t;
        })
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
