package org.tzi.use.examplePlugin.metamodel.retake_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintInterface;

import java.util.List;

public class RetakeConstraintType3 implements RetakeConstraintInterface {
  String assocCls;
  String rolePath;
  String targetAssoc;

  List<AttrCondPro> filters;
}
