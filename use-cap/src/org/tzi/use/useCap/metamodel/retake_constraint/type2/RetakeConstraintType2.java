package org.tzi.use.useCap.metamodel.retake_constraint.type2;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.retake_constraint.RetakeConstraintInterface;

import java.util.List;

public class RetakeConstraintType2 implements RetakeConstraintInterface {
  String assocCls;
  String rolePath;
  String targetAssoc;

  List<IfPart> ifParts;
  List<AttrCondPro> checkForExi;
}
