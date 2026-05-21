package org.tzi.use.useCap.metamodel.structural_constraint;

import org.tzi.use.useCap.ast.ASTInterface;
import org.tzi.use.useCap.logic.ConstraintHandler;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECK_STRUCTURE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CROSS_REFERENCE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.EXCLUDE_SELF;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.IS_UNDEFINED;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.MAX;
import static org.tzi.use.useCap.util.UseUtils.hasKeyEqualsToValue;
import static org.tzi.use.useCap.util.UseUtils.hasKeyEqualsToValueInSpecificParam;
import static org.tzi.use.useCap.util.UseUtils.hasParamsLengthEqualsTo;

public class StructuralConstraintDetector implements ConstraintHandler {

  public StructuralConstraintType detectType(ASTInterface astInterface) {
    if (astInterface.args.size() == 1 && astInterface.args.containsKey(ASSOC_CLS)) {
      return StructuralConstraintType.TYPE3;
    } else if (hasParamsLengthEqualsTo(astInterface, CHECK_STRUCTURE, 1)
        && hasKeyEqualsToValueInSpecificParam(astInterface, EXCLUDE_SELF, "true", CHECK_STRUCTURE)) {
      // if checkStructure has only 1 param and that param has excludesSelf == "true", then it's type 1
      return StructuralConstraintType.TYPE1;
    } else if (hasKeyEqualsToValueInSpecificParam(astInterface, IS_UNDEFINED, "true", CHECK_STRUCTURE)) {
      // if checkStructure has only 1 param and that param has excludesSelf == "false", then it's type 2
      return StructuralConstraintType.TYPE2;
    } else if (hasKeyEqualsToValue(astInterface, CROSS_REFERENCE, true)
        && hasKeyEqualsToValue(astInterface, MAX, 0)) {
      // if crossReference == true and max value is 0, then it's type 4
      return StructuralConstraintType.TYPE4;
    } else {
      System.out.println("Could not detect a specific RetakeConstraintType based on AST attributes. Defaulting to UNSUPPORTED.");
    }
    // Placeholder implementation
    return StructuralConstraintType.UNSUPPORTED;
  }

  @Override
  public String detect(ASTInterface ast) {
    StructuralConstraintType type =
        new StructuralConstraintDetector().detectType(ast);
    return "StructuralConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return StructuralConstraintExecutor.execute(ast, json, context, name);
  }
}
