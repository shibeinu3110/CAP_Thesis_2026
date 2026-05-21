package org.tzi.use.useCap.metamodel.eligibility_constraint.type5;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.eligibility_constraint.EligibilityConstraintInterface;

import java.util.List;

public class EligibilityConstraintType5 implements EligibilityConstraintInterface {
  public String assocCls;
  public String rolePath;
  public List<AttrCondPro> checkForExi;
  public String matchColl;
}
