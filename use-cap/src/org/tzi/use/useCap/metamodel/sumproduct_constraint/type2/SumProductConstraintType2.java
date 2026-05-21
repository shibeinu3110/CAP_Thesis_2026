package org.tzi.use.useCap.metamodel.sumproduct_constraint.type2;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.SumProductConstraintInterface;

import java.util.List;

public class SumProductConstraintType2 implements SumProductConstraintInterface {
  public String assocCls;
  public String rolePath;
  List<IfPart> ifParts;
  List<AttrCondPro> cacu;
  String result;
}
