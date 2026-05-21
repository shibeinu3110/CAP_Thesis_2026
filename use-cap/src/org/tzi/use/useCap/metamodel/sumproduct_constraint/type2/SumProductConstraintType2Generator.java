package org.tzi.use.useCap.metamodel.sumproduct_constraint.type2;

import org.tzi.use.useCap.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.SumProductConstraintGenerator;

import static org.tzi.use.useCap.util.GeneratorUtils.buildAllowedCondition;
import static org.tzi.use.useCap.util.GeneratorUtils.buildIfCondition;

public class SumProductConstraintType2Generator implements SumProductConstraintGenerator<SumProductConstraintType2> {
  @Override
  public String generate(String contextClass, String invariantName, SumProductConstraintType2 sp) {
    System.out.println("Generating EligibilityConstraintType3...");
    String ifCond = buildIfCondition(sp.ifParts, null);
    String impliesPart = (ifCond == null) ? "" : ifCond + " implies\n  ";

    String checkForExi = buildAllowedCondition(sp.cacu, RootScope.ALL, null, true);

    if (sp.result == null || sp.result.isBlank()) {
      throw new IllegalArgumentException("Result cannot be null or blank");
    }

    return """
        context %s::%s derive:
          %s(
            %s
          )
        """.formatted(
        contextClass,
        sp.result,
        impliesPart,
        checkForExi
    );
  }
}
