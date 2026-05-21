package org.tzi.use.examplePlugin.metamodel.structural_constraint.type4;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintInterface;

import java.util.List;

public class StructuralConstraintType4 implements StructuralConstraintInterface {
  String assocCls;
  String targetAssoc;
  String rolePath;

  boolean crossReference;
  int max;

}
