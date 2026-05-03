package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintParser;
import org.tzi.use.examplePlugin.util.ParserUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CACU;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.DERIVE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.RATIO;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.RESULT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SCALE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;

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
