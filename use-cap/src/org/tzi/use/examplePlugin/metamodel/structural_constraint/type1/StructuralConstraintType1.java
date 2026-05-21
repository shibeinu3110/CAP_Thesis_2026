package org.tzi.use.examplePlugin.metamodel.structural_constraint.type1;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintInterface;

import java.util.List;

public class StructuralConstraintType1 implements StructuralConstraintInterface {
  String assocCls;
  String rolePath;

  List<AttrCondPro> checkStructure;
}
