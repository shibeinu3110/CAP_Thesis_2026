package org.tzi.use.examplePlugin.metamodel.sum_constraint.type1;

import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintGenerator;

public class SumConstraintType1Generator implements SumConstraintGenerator<SumConstraintType1> {

  @Override
  public String generate(
      String contextClass,
      String invariantName,
      SumConstraintType1 sc
  ) {

    if (sc.filterAttr == null || sc.matchAttr == null) {
      throw new IllegalArgumentException("Missing required arguments for SumConstraintType1");
    }

    return String.format(
        """
        context %s
        inv %s:
          let s : Integer =
              self.%s
                  ->select(e | e.%s = self.%s)
                  ->collect(e | e.%s.%s)
                  ->sum()
          in
              s = %s
        """,
        contextClass,
        invariantName,
        sc.assocCls,
        sc.filterAttr,
        sc.matchAttr,
        sc.rolePath,
        sc.sumAttr,
        sc.fixAttr
    ).trim();
  }
}
