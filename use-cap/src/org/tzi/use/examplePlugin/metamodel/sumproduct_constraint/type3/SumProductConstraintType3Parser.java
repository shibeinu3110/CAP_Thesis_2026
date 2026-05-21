package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.DERIVE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.RESULT;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.SUM_ATTR;

public class SumProductConstraintType3Parser implements SumProductConstraintParser<SumProductConstraintType3> {

  @Override
  public SumProductConstraintType3 parse(Map<String, Object> astJson) {
    System.out.println("Parsing SumProduct tye 3...");
    SumProductConstraintType3 sp3 = new SumProductConstraintType3();

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);
    sp3.assocCls = (String) args.get(ASSOC_CLS);
    sp3.rolePath = (String) args.get(ROLE_PATH);

    sp3.sumAttr = (String) args.get(SUM_ATTR);
    sp3.derive = (String) args.get(DERIVE);

    sp3.result = (String) args.get(RESULT);

    // check for existence parts
    System.out.println("Parsing check for existence part:");
    return sp3;
  }
}
