package org.tzi.use.useCap.metamodel.sumproduct_constraint.type3;

import org.tzi.use.useCap.metamodel.sumproduct_constraint.SumProductConstraintInterface;

public class SumProductConstraintType3 implements SumProductConstraintInterface {
  public String assocCls;
  public String rolePath;
  public String sumAttr;
  public String derive;    // "maxStudents - sumAttr"
  public String result;
}
