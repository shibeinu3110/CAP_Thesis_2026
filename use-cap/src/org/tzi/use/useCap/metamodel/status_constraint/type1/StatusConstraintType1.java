package org.tzi.use.useCap.metamodel.status_constraint.type1;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.status_constraint.StatusConstraintInterface;

import java.util.List;

public class StatusConstraintType1 implements StatusConstraintInterface {
  List<IfPart> ifParts;
  List<AttrCondPro> checkStatus;
}
