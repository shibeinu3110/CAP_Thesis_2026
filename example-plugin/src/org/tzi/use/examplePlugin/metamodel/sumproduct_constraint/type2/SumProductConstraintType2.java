package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.type2;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.Cacu;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintInterface;

import java.util.List;

public class SumProductConstraintType2 implements SumProductConstraintInterface {
  public String assocCls;
  public String rolePath;
  List<IfPart> ifParts;
  List<AttrCondPro> cacu;
  String result;
}
