package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintInterface;

import java.util.List;

public class SumProductConstraintType3 implements SumProductConstraintInterface {
  public String assocCls;
  public String rolePath;
  public String sumAttr;
  public String derive;    // "maxStudents - sumAttr"
  public String result;
}
