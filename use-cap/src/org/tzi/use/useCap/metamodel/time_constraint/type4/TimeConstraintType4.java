package org.tzi.use.useCap.metamodel.time_constraint.type4;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.time_constraint.TimeConstraintInterface;

import java.util.List;

public class TimeConstraintType4 implements TimeConstraintInterface {
  String rolePath;
  List<IfPart> ifParts;
  List<AttrCondPro> checkForExi;
}
