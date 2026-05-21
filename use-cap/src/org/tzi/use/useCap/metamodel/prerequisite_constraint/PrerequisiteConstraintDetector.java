package org.tzi.use.useCap.metamodel.prerequisite_constraint;

import org.tzi.use.useCap.ast.ASTInterface;
import org.tzi.use.useCap.logic.ConstraintHandler;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECK_EXEC;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CROSS_REFERENCE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.MAX_DEPTH_LIMIT;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.NO_SELF;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.RELATIONS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.REQUIRES;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.REQUIRE_EXIST;
import static org.tzi.use.useCap.util.UseUtils.hasSpecificKey;

public class PrerequisiteConstraintDetector implements ConstraintHandler {

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

  @Override
  public String detect(ASTInterface ast) {
    PrerequisiteConstraintType type =
        new PrerequisiteConstraintDetector().detectType(ast);
    return "PrerequisiteConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return PrerequisiteConstraintExecutor.execute(ast, json, context, name);
  }
}
