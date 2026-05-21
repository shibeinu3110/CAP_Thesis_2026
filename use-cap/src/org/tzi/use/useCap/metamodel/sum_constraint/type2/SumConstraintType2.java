package org.tzi.use.useCap.metamodel.sum_constraint.type2;

import org.tzi.use.useCap.metamodel.sum_constraint.SumConstraintInterface;
import org.tzi.use.useCap.util.enumarate.BoundType;
import org.tzi.use.useCap.util.enumarate.IfFixType;

public class SumConstraintType2 implements SumConstraintInterface {
  String assocCls;
  String rolePath;
  String filterAttr;
  String matchAttr;
  String sumAttr;

  BoundType lowerBoundType;
  String lowerBoundValue;

  BoundType upperBoundType;
  String upperBoundValue;

  String ifAttr;
  IfFixType ifFixType;
  String ifFixValue;
  boolean negated;
}