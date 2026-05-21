package org.tzi.use.useCap.metamodel.retake_constraint.type4;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.retake_constraint.RetakeConstraintInterface;

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
