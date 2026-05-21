package org.tzi.use.useCap.metamodel.status_constraint.type5;

import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.status_constraint.StatusConstraintInterface;

import java.util.List;

public class StatusConstraintType5 implements StatusConstraintInterface {
  String assocCls;
  String rolePath;
  List<IfPart> ifParts;

  List<AttrCondPro> checkStatus;
}
