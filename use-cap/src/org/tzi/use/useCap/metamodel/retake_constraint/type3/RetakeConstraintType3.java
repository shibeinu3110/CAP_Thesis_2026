package org.tzi.use.useCap.metamodel.retake_constraint.type3;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.retake_constraint.RetakeConstraintInterface;

import java.util.List;

public class RetakeConstraintType3 implements RetakeConstraintInterface {
  String assocCls;
  String rolePath;
  String targetAssoc;

  List<AttrCondPro> filters;
}
