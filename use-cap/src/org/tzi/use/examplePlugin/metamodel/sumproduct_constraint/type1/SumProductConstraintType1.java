package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.type1;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.Cacu;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintInterface;
import org.w3c.dom.Attr;

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
