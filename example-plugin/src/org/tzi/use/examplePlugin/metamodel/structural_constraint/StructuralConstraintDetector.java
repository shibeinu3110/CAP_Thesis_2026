package org.tzi.use.examplePlugin.metamodel.structural_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_FOR_EXI;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_STRUCTURE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.COLLECT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CROSS_REFERENCE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.EXCLUDE_SELF;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.IF_PART;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.IS_UNDEFINED;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MATCH_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.util.CommonVar.SELF;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValue;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValueInSpecificParam;
import static org.tzi.use.examplePlugin.util.UseUtils.hasParamsLengthEqualsTo;
import static org.tzi.use.examplePlugin.util.UseUtils.hasSpecificKey;

public class StructuralConstraintDetector {

  public StructuralConstraintType detectType(ASTInterface astInterface) {
    if (hasParamsLengthEqualsTo(astInterface, CHECK_STRUCTURE, 1)
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
}
