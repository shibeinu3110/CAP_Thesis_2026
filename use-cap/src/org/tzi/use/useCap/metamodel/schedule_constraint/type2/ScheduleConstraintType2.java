package org.tzi.use.useCap.metamodel.schedule_constraint.type2;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.schedule_constraint.ScheduleConstraintInterface;

import java.util.List;

public class ScheduleConstraintType2 implements ScheduleConstraintInterface {

  String assocCls;
  String targetAssoc;
  String rolePath;

  public List<IfPart> ifParts;
  public List<AttrCondPro> checkForExi;

  public List<AttrCondPro> altParts;
}
