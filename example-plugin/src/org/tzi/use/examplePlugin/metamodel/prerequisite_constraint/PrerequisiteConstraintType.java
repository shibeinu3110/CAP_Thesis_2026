package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type2.PrerequisiteConstraintType2Generator;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type2.PrerequisiteType2Parser;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type3.PrerequisiteConstraintType3Generator;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type3.PrerequisiteType3Parser;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type1.RetakeConstraintType1Generator;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type1.RetakeConstraintType1Parser;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type2.RetakeConstraintType2Generator;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type2.RetakeConstraintType2Parser;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type3.RetakeConstraintType3Generator;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type3.RetakeConstraintType3Parser;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type4.RetakeConstraintType4Generator;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.type4.RetakeConstraintType4Parser;

public enum PrerequisiteConstraintType {
  TYPE1(null, null),
  TYPE2(new PrerequisiteType2Parser(), new PrerequisiteConstraintType2Generator()),
  TYPE3(new PrerequisiteType3Parser(), new PrerequisiteConstraintType3Generator()),
  TYPE4(null, null),
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
