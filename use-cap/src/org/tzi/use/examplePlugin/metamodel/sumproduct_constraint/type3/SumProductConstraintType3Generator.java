package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.type3;

import org.tzi.use.examplePlugin.CaculatorEnum;
import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintGenerator;

import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildAllowedCondition;
import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildIfCondition;

public class SumProductConstraintType3Generator implements SumProductConstraintGenerator<SumProductConstraintType3> {
  @Override
  public String generate(String contextClass, String invariantName, SumProductConstraintType3 sp) {
    String ite = sp.assocCls.substring(0, 1).toLowerCase(); // e

    String sumExpr = buildSumExpr(sp.assocCls, ite, sp.sumAttr);

    String finalExpr = formatDerive(sp.derive, sumExpr);

    return """
        context %s::%s : Integer derive:
        %s
        """.formatted(
        contextClass,
        sp.result,
        indent(finalExpr, 2)
    );
  }

  private String indent(String text, int spaces) {
    String pad = " ".repeat(spaces);
    return text.lines()
        .map(line -> pad + line)
        .reduce((a, b) -> a + "\n" + b)
        .orElse("");
  }

  private String buildSumExpr(String assocCls, String ite, String sumAttr) {

    String expr;

    if ("1".equals(sumAttr)) {
      expr = "1";
    } else {
      expr = ite + "." + sumAttr;
    }

    return """
        self.%s->collect(%s | %s)->sum()
        """.formatted(assocCls, ite, expr);
  }

  private String formatDerive(String derive, String sumExpr) {

    for (CaculatorEnum op : CaculatorEnum.values()) {

      if (derive.contains(op.symbol)) {

        String[] parts = derive.split(java.util.regex.Pattern.quote(op.symbol), 2);

        String left = parts[0].trim();
        String right = parts[1].trim();

        String leftExpr =
            left.equals("sumAttr") ? sumExpr : "self." + left;

        String rightExpr =
            right.equals("sumAttr") ? sumExpr : "self." + right;

        return """
            %s %s
            %s
            """.formatted(leftExpr, op.symbol, rightExpr);
      }
    }

    return derive;
  }
}
