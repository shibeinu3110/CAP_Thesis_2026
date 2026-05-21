package org.tzi.use.useCap.metamodel.size_constraint.type1;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.size_constraint.Bound;
import org.tzi.use.useCap.metamodel.size_constraint.SizeConstraintInterface;

import java.util.List;

public class SizeConstraintType1 implements SizeConstraintInterface {
  String assocCls;
  String rolePath;
  String targetCollection;

  List<IfPart> ifParts;

  List<AttrCondPro> filters;

  List<Bound> bounds;

  Number scale;
}
