package org.tzi.use.useCap.metamodel.sumproduct_constraint.type1;

import org.tzi.use.useCap.CaculatorEnum;
import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.Cacu;
import org.tzi.use.useCap.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.SumProductConstraintGenerator;
import org.tzi.use.useCap.util.GeneratorUtils;

import java.util.List;
import java.util.regex.Pattern;

public class SumProductConstraintType1Generator implements SumProductConstraintGenerator<SumProductConstraintType1> {
  @Override
  public String generate(String contextClass, String invariantName, SumProductConstraintType1 sp) {
    String ite = sp.assocCls.substring(0, 1).toLowerCase(); // e

    // filter
    String filterCond = buildFilter(sp.filters, ite);

    String select = filterCond.equals("true")
        ? ""
        : "->select(" + ite + " | " + filterCond + ")";

    // expr
    String expr1 = buildExpr(sp.sumAttr1, ite, sp.rolePath);
    String expr2 = buildExpr(sp.sumAttr2, ite, sp.rolePath);

    String sum1 = buildSum(sp.assocCls, select, ite, expr1);
    String sum2 = buildSum(sp.assocCls, select, ite, expr2);

    // derive
    String finalExpr = formatDerive(sp.derive, sum1, sum2);

    return """
        context %s::%s derive:
          %s
        """.formatted(
        contextClass,
        sp.result,
        indent(finalExpr, 2)
    );
  }

  private String buildFilter(List<AttrCondPro> filter, String ite) {
    if (filter == null || filter.isEmpty()) return "true";

    return GeneratorUtils.buildAllowedCondition(
        filter,
        RootScope.NONE,
        ite,
        false
    );
  }

  private String buildExpr(Cacu c, String e, String rolePath) {

    if (c.attr2 != null && !c.attr2.isEmpty()) {
      return e + "." + c.attr +
          " * " +
          e + "." + rolePath + "." + c.attr2;
    }

    return e + "." + rolePath + "." + c.attr;
  }

  private String indent(String text, int spaces) {
    String pad = " ".repeat(spaces);
    return text.lines()
        .map(line -> pad + line)
        .reduce((a, b) -> a + "\n" + b)
        .orElse("");
  }

  private String buildSum(String assocCls, String select, String ite, String expr) {
    return """
        self.%s%s->collect(%s 
            | %s)->sum()
        """.formatted(
        assocCls,
        select,
        ite,
        expr
    );
  }

  private String formatDerive(String derive, String sum1, String sum2) {
    for (CaculatorEnum op : CaculatorEnum.values()) {
      if (derive.contains(op.symbol)) {
        String[] parts = derive.split(Pattern.quote(op.symbol));

        String left = parts[0].trim();
        String right = parts[1].trim();

        String leftExpr = left.equals("sumAttr1") ? sum1 : sum2;
        String rightExpr = right.equals("sumAttr1") ? sum1 : sum2;

        return """
            %s
            %s
            %s
            """.formatted(
            leftExpr.trim(),
            op.symbol,
            rightExpr.trim()
        );
      }
    }

    return derive;
  }

}
