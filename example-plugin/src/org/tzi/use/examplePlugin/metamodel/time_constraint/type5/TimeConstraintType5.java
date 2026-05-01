package org.tzi.use.examplePlugin.metamodel.time_constraint.type5;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.time_constraint.TimeConstraintInterface;

import java.util.List;

public class TimeConstraintType5 implements TimeConstraintInterface {
  String targetAssoc;
  String sumAttr;
  Integer max;
  List<IfPart> ifParts;
}
