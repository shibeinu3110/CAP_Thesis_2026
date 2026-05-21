package org.tzi.use.useCap.metamodel.sumproduct_constraint.type1;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.Cacu;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.SumProductConstraintInterface;

import java.util.List;

public class SumProductConstraintType1 implements SumProductConstraintInterface {
  String assocCls;
  String rolePath;
  List<AttrCondPro> filters;

  Cacu sumAttr1;
  Cacu sumAttr2;

  // for derive function: e.g: sumAttr1 / sumAttr2
  String derive;

  // result, which we want to calculate: e.g GPA
  String result;
}
