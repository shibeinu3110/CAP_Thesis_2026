package org.tzi.use.useCap.metamodel.sumproduct_constraint;

import org.tzi.use.useCap.metamodel.sumproduct_constraint.type1.SumProductConstraintType1Generator;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.type1.SumProductConstraintType1Parser;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.type2.SumProductConstraintType2Generator;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.type2.SumProductConstraintType2Parser;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.type3.SumProductConstraintType3Generator;
import org.tzi.use.useCap.metamodel.sumproduct_constraint.type3.SumProductConstraintType3Parser;

public enum SumProductConstraintType {
  TYPE1(new SumProductConstraintType1Parser(), new SumProductConstraintType1Generator()),
  TYPE2(new SumProductConstraintType2Parser(), new SumProductConstraintType2Generator()),
  TYPE3(new SumProductConstraintType3Parser(), new SumProductConstraintType3Generator()),
  TYPE4(null, null),
  UNSUPPORTED(null, null);

  public final SumProductConstraintParser<?> parser;
  public final SumProductConstraintGenerator<?> generator;

  SumProductConstraintType(
      SumProductConstraintParser<? extends SumProductConstraintInterface> parser,
      SumProductConstraintGenerator<? extends SumProductConstraintInterface> generator
  ) {
    this.parser = parser;
    this.generator = generator;
  }

  @SuppressWarnings("unchecked")
  public <T extends SumProductConstraintInterface> SumProductConstraintParser<T> parser() {
    return (SumProductConstraintParser<T>) parser;
  }

  @SuppressWarnings("unchecked")
  public <T extends SumProductConstraintInterface> SumProductConstraintGenerator<T> generator() {
    return (SumProductConstraintGenerator<T>) generator;
  }
}
