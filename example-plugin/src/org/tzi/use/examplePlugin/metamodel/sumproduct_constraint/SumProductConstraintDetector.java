package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint;

import org.tzi.use.examplePlugin.CaculatorEnum;
import org.tzi.use.examplePlugin.ast.ASTInterface;

import java.util.Arrays;
import java.util.List;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.IF_PART;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR1;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR2;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.WINDOW;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyIn;
import static org.tzi.use.examplePlugin.util.UseUtils.hasKeyInCheckForExi;
import static org.tzi.use.examplePlugin.util.UseUtils.hasSpecificKey;

public class SumProductConstraintDetector {
  public SumProductConstraintType detectType(ASTInterface astInterface) {

    List<String> keys = Arrays.stream(CaculatorEnum.values())
        .map(e -> e.name().toLowerCase())
        .toList();

      if (hasSpecificKey(astInterface, SUM_ATTR1)
        && hasSpecificKey(astInterface, SUM_ATTR2)) {
        return SumProductConstraintType.TYPE1;
      }

    // Placeholder implementation
    return SumProductConstraintType.UNSUPPORTED;
  }
}
