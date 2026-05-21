package org.tzi.use.useCap.metamodel.structural_constraint;

import org.tzi.use.useCap.metamodel.structural_constraint.type1.StructuralConstraintType1Generator;
import org.tzi.use.useCap.metamodel.structural_constraint.type1.StructuralConstraintType1Parser;
import org.tzi.use.useCap.metamodel.structural_constraint.type2.StructuralConstraintType2Generator;
import org.tzi.use.useCap.metamodel.structural_constraint.type2.StructuralConstraintType2Parser;
import org.tzi.use.useCap.metamodel.structural_constraint.type3.StructuralConstraintType3Generator;
import org.tzi.use.useCap.metamodel.structural_constraint.type3.StructuralConstraintType3Parser;
import org.tzi.use.useCap.metamodel.structural_constraint.type4.StructuralConstraintType4Generator;
import org.tzi.use.useCap.metamodel.structural_constraint.type4.StructuralConstraintType4Parser;

public enum StructuralConstraintType {
  TYPE1(new StructuralConstraintType1Parser(), new StructuralConstraintType1Generator()),
  TYPE2(new StructuralConstraintType2Parser(), new StructuralConstraintType2Generator()),
  TYPE3(new StructuralConstraintType3Parser(), new StructuralConstraintType3Generator()),
  TYPE4(new StructuralConstraintType4Parser(), new StructuralConstraintType4Generator()),
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
