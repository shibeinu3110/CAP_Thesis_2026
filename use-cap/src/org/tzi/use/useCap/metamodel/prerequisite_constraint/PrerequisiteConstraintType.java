package org.tzi.use.useCap.metamodel.prerequisite_constraint;

import org.tzi.use.useCap.metamodel.prerequisite_constraint.type10.PrerequisiteConstraintType10Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type10.PrerequisiteType10Parser;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type11.PrerequisiteConstraintType11Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type11.PrerequisiteType11Parser;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type12.PrerequisiteConstraintType12Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type12.PrerequisiteType12Parser;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type2.PrerequisiteConstraintType2Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type2.PrerequisiteType2Parser;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type3.PrerequisiteConstraintType3Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type3.PrerequisiteType3Parser;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type5.PrerequisiteConstraintType5Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type5.PrerequisiteType5Parser;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type7.PrerequisiteConstraintType7Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type7.PrerequisiteType7Parser;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type9.PrerequisiteConstraintType9Generator;
import org.tzi.use.useCap.metamodel.prerequisite_constraint.type9.PrerequisiteType9Parser;

public enum PrerequisiteConstraintType {
  TYPE1(null, null),
  TYPE2(new PrerequisiteType2Parser(), new PrerequisiteConstraintType2Generator()),
  TYPE3(new PrerequisiteType3Parser(), new PrerequisiteConstraintType3Generator()),
  TYPE4(null, null),
  TYPE5(new PrerequisiteType5Parser(), new PrerequisiteConstraintType5Generator()),
  TYPE6(null, null),
  TYPE7(new PrerequisiteType7Parser(), new PrerequisiteConstraintType7Generator()),
  TYPE9(new PrerequisiteType9Parser(), new PrerequisiteConstraintType9Generator()),
  TYPE10(new PrerequisiteType10Parser(), new PrerequisiteConstraintType10Generator()),
  TYPE11(new PrerequisiteType11Parser(), new PrerequisiteConstraintType11Generator()),
  TYPE12(new PrerequisiteType12Parser(), new PrerequisiteConstraintType12Generator()),
  UNSUPPORTED(null, null);

  public final PrerequisiteConstraintParser<?> parser;
  public final PrerequisiteConstraintGenerator<?> generator;

  PrerequisiteConstraintType(
      PrerequisiteConstraintParser<? extends PrerequisiteConstraintInterface> parser,
      PrerequisiteConstraintGenerator<? extends PrerequisiteConstraintInterface> generator
  ) {
    this.parser = parser;
    this.generator = generator;
  }

  @SuppressWarnings("unchecked")
  public <T extends PrerequisiteConstraintInterface> PrerequisiteConstraintParser<T> parser() {
    return (PrerequisiteConstraintParser<T>) parser;
  }

  @SuppressWarnings("unchecked")
  public <T extends PrerequisiteConstraintInterface> PrerequisiteConstraintGenerator<T> generator() {
    return (PrerequisiteConstraintGenerator<T>) generator;
  }
}
