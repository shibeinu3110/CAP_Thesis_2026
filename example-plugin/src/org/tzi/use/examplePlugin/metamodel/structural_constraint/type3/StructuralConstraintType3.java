package org.tzi.use.examplePlugin.metamodel.structural_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintInterface;

import java.util.List;

// @StructuralConstraint(association = "parentDepartment")

// To be used for cyclic constraints where we want to check the structure of the association (e.g., parentDepartment) without checking for existence. The checkStructure attribute allows us to specify conditions on the attributes of the associated objects, and the rolePath attribute allows us to specify the path to the associated objects
// e.g: a department's parent should not have the same name as the department itself, and the parent department's parent should not have the same name as the department itself

public class StructuralConstraintType3 implements StructuralConstraintInterface {
  String assocCls;
}
