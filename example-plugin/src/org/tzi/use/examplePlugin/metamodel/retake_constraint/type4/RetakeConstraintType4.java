package org.tzi.use.examplePlugin.metamodel.retake_constraint.type4;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintInterface;

import java.util.List;

public class RetakeConstraintType4 implements RetakeConstraintInterface {
  String assocCls;
  String rolePath;
  String targetAssoc;

  List<IfPart> ifParts;

  List<AttrCondPro> checkForExi;

  // same structure as ifParts, but used for exists part in OCL generation
  List<AttrCondPro> checkForExi2;
}
