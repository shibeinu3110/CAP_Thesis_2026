package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECKED_ROLE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_FOR_EXI;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_FOR_EXI2;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.COLLECT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.IF_PART;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MATCH_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.REQUIRES;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValue;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValueInSpecificParam;
import static org.tzi.use.examplePlugin.util.UseUtils.hasParamsLengthEqualsTo;
import static org.tzi.use.examplePlugin.util.UseUtils.hasSpecificKey;

public class PrerequisiteConstraintDetector {

  public PrerequisiteConstraintType detectType(ASTInterface astInterface) {

    System.out.println("Detecting prerequisite constraint type...");

    if (hasSpecificKey(astInterface, CHECKED_ROLE) && !hasSpecificKey(astInterface, REQUIRES)) {
      return PrerequisiteConstraintType.TYPE2;
    } else if (hasSpecificKey(astInterface, CHECKED_ROLE) && hasSpecificKey(astInterface, REQUIRES)) {
      return PrerequisiteConstraintType.TYPE3;

    }
    return PrerequisiteConstraintType.UNSUPPORTED;
  }
}
