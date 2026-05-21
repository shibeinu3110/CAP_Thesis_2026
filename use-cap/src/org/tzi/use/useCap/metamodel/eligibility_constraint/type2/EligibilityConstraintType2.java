package org.tzi.use.useCap.metamodel.eligibility_constraint.type2;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.eligibility_constraint.EligibilityConstraintInterface;

import java.util.List;

public class EligibilityConstraintType2 implements EligibilityConstraintInterface {
  public String assocCls;
  public String rolePath;
  List<IfPart> ifParts;
  List<AttrCondPro> checkForExi;
}
