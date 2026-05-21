package org.tzi.use.examplePlugin.metamodel.structural_constraint.type2;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintInterface;

import java.util.List;

public class StructuralConstraintType2 implements StructuralConstraintInterface {
  String assocCls;
  String rolePath;

  List<AttrCondPro> checkStructure;
}
