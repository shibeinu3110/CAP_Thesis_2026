package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECKED_ROLE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_EXEC;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_FOR_EXI;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_FOR_EXI2;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.COLLECT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CROSS_REFERENCE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.IF_PART;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MATCH_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX_DEPTH_LIMIT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.NO_SELF;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.RELATIONS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.REQUIRES;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.REQUIRE_EXIST;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValue;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValueInSpecificParam;
import static org.tzi.use.examplePlugin.util.UseUtils.hasParamsLengthEqualsTo;
import static org.tzi.use.examplePlugin.util.UseUtils.hasSpecificKey;

public class PrerequisiteConstraintDetector {

  public PrerequisiteConstraintType detectType(ASTInterface astInterface) {

    System.out.println("Detecting prerequisite constraint type...");

    if (hasSpecificKey(astInterface, CHECKED_ROLE)
        && !hasSpecificKey(astInterface, REQUIRES)
        && !hasSpecificKey(astInterface, NO_SELF)
        && !hasSpecificKey(astInterface, MAX_DEPTH_LIMIT)
        && !hasSpecificKey(astInterface, RELATIONS)
        && !hasSpecificKey(astInterface, REQUIRE_EXIST)
        && !hasSpecificKey(astInterface, CROSS_REFERENCE)) {
      return PrerequisiteConstraintType.TYPE2;
    } else if (hasSpecificKey(astInterface, REQUIRES)) {
      return hasSpecificKey(astInterface, CHECKED_ROLE) ? PrerequisiteConstraintType.TYPE3 : PrerequisiteConstraintType.TYPE12;
    } else if (hasSpecificKey(astInterface, NO_SELF)) {
      return PrerequisiteConstraintType.TYPE7;
    } else if (hasSpecificKey(astInterface, MAX_DEPTH_LIMIT)) {
      return PrerequisiteConstraintType.TYPE9;
    } else if (hasSpecificKey(astInterface, RELATIONS)) {
      return PrerequisiteConstraintType.TYPE5;
    } else if (hasSpecificKey(astInterface, REQUIRE_EXIST)) {
      return PrerequisiteConstraintType.TYPE10;
    } else if (hasSpecificKey(astInterface, CROSS_REFERENCE) && hasSpecificKey(astInterface, CHECK_EXEC)) {
      return PrerequisiteConstraintType.TYPE11;
    }
    return PrerequisiteConstraintType.UNSUPPORTED;
  }
}
