package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.type2;

import org.tzi.use.examplePlugin.CaculatorEnum;
import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.Cacu;
import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintGenerator;
import org.tzi.use.examplePlugin.util.GeneratorUtils;

import java.util.List;
import java.util.regex.Pattern;

import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildAllowedCondition;
import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildIfCondition;

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
