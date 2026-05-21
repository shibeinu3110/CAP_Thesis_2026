package org.tzi.use.useCap.metamodel.sumproduct_constraint.type1;

import org.tzi.use.useCap.metamodel.sumproduct_constraint.SumProductConstraintParser;
import org.tzi.use.useCap.util.ParserUtil;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.DERIVE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.FILTERS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.RESULT;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.SUM_ATTR1;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.SUM_ATTR2;

public class SumProductConstraintType1Parser implements SumProductConstraintParser<SumProductConstraintType1> {

  @Override
  public SumProductConstraintType1 parse(Map<String, Object> astJson) {
    SumProductConstraintType1 tc1 = new SumProductConstraintType1();

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    tc1.assocCls = (String) args.get(ASSOC_CLS);
    tc1.rolePath = (String) args.get(ROLE_PATH);

    tc1.filters = ParserUtil.parseCheckForExi(args, FILTERS);

    System.out.println("filters: " + tc1.filters);

    tc1.sumAttr1 = ParserUtil.parseCacu(args, SUM_ATTR1);
    tc1.sumAttr2 = ParserUtil.parseCacu(args, SUM_ATTR2);

    tc1.derive = (String) args.get(DERIVE);
    tc1.result = (String) args.get(RESULT);

    return tc1;
  }
}
