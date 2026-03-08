package org.tzi.use.examplePlugin.metamodel.structural_constraint;

import org.tzi.use.examplePlugin.metamodel.structural_constraint.type1.StructuralConstraintType1Generator;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.type1.StructuralConstraintType1Parser;

public enum StructuralConstraintType {
  TYPE1(new StructuralConstraintType1Parser(), new StructuralConstraintType1Generator()),
  TYPE2(null, null),
  TYPE3(null, null),
  TYPE4(null, null),
  TYPE5(null, null),
  UNSUPPORTED(null, null);

  public final StructuralConstraintParser<?> parser;
  public final StructuralConstraintGenerator<?> generator;

  StructuralConstraintType(
      StructuralConstraintParser<? extends StructuralConstraintInterface> parser,
      StructuralConstraintGenerator<? extends StructuralConstraintInterface> generator
  ) {
    this.parser = parser;
    this.generator = generator;
  }

  @SuppressWarnings("unchecked")
  public <T extends StructuralConstraintInterface> StructuralConstraintParser<T> parser() {
    return (StructuralConstraintParser<T>) parser;
  }

  @SuppressWarnings("unchecked")
  public <T extends StructuralConstraintInterface> StructuralConstraintGenerator<T> generator() {
    return (StructuralConstraintGenerator<T>) generator;
  }
}
