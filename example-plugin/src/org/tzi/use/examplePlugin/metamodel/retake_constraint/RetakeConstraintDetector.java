package org.tzi.use.examplePlugin.metamodel.retake_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_FOR_EXI;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.COLLECT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.IF_PART;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MATCH_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValue;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyEqualsToValueInSpecificParam;
import static org.tzi.use.examplePlugin.util.UseUtils.hasParamsLengthEqualsTo;
import static org.tzi.use.examplePlugin.util.UseUtils.hasSpecificKey;

public class RetakeConstraintDetector {

  public RetakeConstraintType detectType(ASTInterface astInterface) {

    System.out.println("Detecting RetakeConstraintType based on AST attributes...");

    System.out.println("SUM_ATTR=1: " + hasKeyEqualsToValue(astInterface, SUM_ATTR, "1"));
    System.out.println("MAX=0: " + hasKeyEqualsToValue(astInterface, MAX, 0));
    System.out.println("COLLECT length=1: " + hasParamsLengthEqualsTo(astInterface, COLLECT, 1));

    if (hasKeyEqualsToValue(astInterface, SUM_ATTR, "1")
        && hasKeyEqualsToValue(astInterface, MAX, 0)
        && !hasParamsLengthEqualsTo(astInterface, COLLECT, 1)) {
      // if sumAttr == "1" and max == 0, then it's type 1
      return RetakeConstraintType.TYPE1;
    } else if (hasKeyEqualsToValueInSpecificParam(astInterface, MATCH_ATTR, "self", CHECK_FOR_EXI)) {
      // if matchAttr == "self" in CHECK_FOR_EXI, then it's type 2
      return RetakeConstraintType.TYPE2;
    } else if (hasKeyEqualsToValue(astInterface, SUM_ATTR, "1")
        && hasKeyEqualsToValue(astInterface, MAX, 0)
        && hasParamsLengthEqualsTo(astInterface, COLLECT, 1)
        && !hasSpecificKey(astInterface, IF_PART)) {
      return RetakeConstraintType.TYPE3;
    } else {
      System.out.println("Could not detect a specific RetakeConstraintType based on AST attributes. Defaulting to UNSUPPORTED.");
    }
    // Placeholder implementation
    return RetakeConstraintType.UNSUPPORTED;
  }
}
