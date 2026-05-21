package org.tzi.use.examplePlugin.metamodel.eligibility_constraint;

import org.tzi.use.examplePlugin.ast.ASTInterface;
import org.tzi.use.examplePlugin.logic.ConstraintHandler;

import java.util.List;
import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECK_FOR_EXI;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.MATCH_COLL;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.MIN;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.RATIO;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.SCALE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.SUM_ATTR;

public class EligibilityConstraintDetector implements ConstraintHandler {
  public EligibilityConstraintType detectType(ASTInterface astInterface) {
    if (hasSumAttribute(astInterface) && hasMax(astInterface)) {
      return EligibilityConstraintType.TYPE1;
    } else if (hasCheckForExi(astInterface)
        && !hasKeyInCheckForExi(astInterface, List.of(SCALE, RATIO))
        && !hasMin(astInterface)
        && !hasKeyInCheckForExi(astInterface, List.of(MATCH_COLL))) {
      return EligibilityConstraintType.TYPE2;
    } else if (hasKeyInCheckForExi(astInterface, List.of(SCALE, RATIO))) {
      return EligibilityConstraintType.TYPE3;
    } else if (hasMin(astInterface)) {
      return EligibilityConstraintType.TYPE4;
    } else if (hasKeyInCheckForExi(astInterface, List.of(MATCH_COLL))) {
      return EligibilityConstraintType.TYPE5;
    }
    // Placeholder implementation
    return EligibilityConstraintType.UNSUPPORTED;
  }

  private boolean hasSumAttribute(ASTInterface astInterface) {
    return astInterface.args.get(SUM_ATTR) != null;
  }

  public boolean hasMax(ASTInterface astInterface) {
    return astInterface.args.get(MAX) != null;
  }

  public boolean hasMin(ASTInterface astInterface) {
    return astInterface.args.get(MIN) != null;
  }

  public boolean hasCheckForExi(ASTInterface astInterface) {
    return astInterface.args.get(CHECK_FOR_EXI) != null;
  }

  /**
   * Check for has specific key (scale, ratio, matchColl..) in checkForExi
   *
   * @param astInterface
   * @return
   */
  public boolean hasKeyInCheckForExi(ASTInterface astInterface, List<String> key) {

    Object raw = astInterface.args.get(CHECK_FOR_EXI);

    if (!(raw instanceof List<?> list)) {
      return false;
    }
    for (Object o : list) {
      if (!(o instanceof ASTInterface cond)) {
        continue;
      }
      Map<String, Object> args = cond.args;
      if (args == null) {
        continue;
      }
      for (String k : key) {
        if (args.containsKey(k)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public String detect(ASTInterface ast) {
    EligibilityConstraintType type =
        new EligibilityConstraintDetector().detectType(ast);
    return "EligibilityConstraint: " + type;
  }

  @Override
  public String execute(ASTInterface ast,
                        Map<String, Object> json,
                        String context,
                        String name) {
    return EligibilityConstraintExecutor.execute(ast, json, context, name);
  }

}
