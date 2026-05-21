package org.tzi.use.useCap.metamodel.eligibility_constraint.type1;

import org.tzi.use.useCap.metamodel.eligibility_constraint.EligibilityConstraintGenerator;
import org.tzi.use.useCap.metamodel.eligibility_constraint.RootScope;

import static org.tzi.use.useCap.util.GeneratorUtils.buildAllowedCondition;
import static org.tzi.use.useCap.util.GeneratorUtils.buildIfCondition;

public class EligibilityConstraintType1Generator implements EligibilityConstraintGenerator<EligibilityConstraintType1> {
  @Override
  public String generate(String contextClass, String invariantName, EligibilityConstraintType1 ec) {
    System.out.println("Generating EligibilityConstraintType1...");
    String ifCond = buildIfCondition(ec.ifParts, null);
    String impliesPart = (ifCond == null) ? "" : ifCond + " implies\n  ";

    String allowedCond = buildAllowedCondition(ec.filters, RootScope.LAST_ONLY, null, false);

    return """
        context %s
        inv %s:
          %sself.%s->forAll(e |
            %s
          )
        """.formatted(
        contextClass,
        invariantName,
        impliesPart,
        ec.assocCls,
        allowedCond
    );
  }
}
