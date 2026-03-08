package org.tzi.use.examplePlugin.metamodel.retake_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintParser;
import org.tzi.use.examplePlugin.util.ParserUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.COLLECT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.TARGET_ASSOC;

public class RetakeConstraintType3Parser implements RetakeConstraintParser<RetakeConstraintType3> {

  @Override
  public RetakeConstraintType3 parse(Map<String, Object> astJson) {
    RetakeConstraintType3 rc2 = new RetakeConstraintType3();

    System.out.println("Parsing RetakeConstraintType3...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    // assocCls and rolePath
    rc2.assocCls = (String) args.get(ASSOC_CLS);
    rc2.rolePath = (String) args.get(ROLE_PATH);
    rc2.targetAssoc = (String) args.get(TARGET_ASSOC);

    parseCollect(args, rc2);

    return rc2;
  }

  private static void parseCollect(
      Map<String, Object> args,
      RetakeConstraintType3 rc3
  ) {

    List<Map<String, Object>> collect =
        (List<Map<String, Object>>) args.get(COLLECT);

    if (collect == null || collect.isEmpty()) return;

    List<AttrCondPro> attrConds = new ArrayList<>();

    for (Map<String, Object> attrCond : collect) {

      Map<String, Object> condArgs =
          (Map<String, Object>) attrCond.get(ARGS);

      System.out.println("Parsing collect condition: " + condArgs);

      AttrCondPro c = new AttrCondPro();
      c.attrs = ParserUtil.parseAttrsFromCondArgs(condArgs);
      c.neg = Boolean.TRUE.equals(condArgs.get("neg"));

      if (condArgs.containsKey("minLim")) {
        c.type = AttrCondPro.Type.MIN_LIM;
        c.matchAttr = String.valueOf(condArgs.get("minLim"));
      } else if (condArgs.containsKey("maxLim")) {
        c.type = AttrCondPro.Type.MAX_LIM;
        c.matchAttr = String.valueOf(condArgs.get("maxLim"));
      } else if (condArgs.containsKey("fixBool")) {
        c.type = AttrCondPro.Type.FIX_BOOL;
        c.matchAttr = String.valueOf(condArgs.get("fixBool"));
      } else if(condArgs.containsKey("fixNum")) {
        c.type = AttrCondPro.Type.FIX_NUM;
        c.matchAttr = String.valueOf(condArgs.get("fixNum"));
      } else if (condArgs.containsKey("minLimAttr")) {
        c.type = AttrCondPro.Type.MIN_LIM_ATTR;
        c.matchAttr = String.valueOf(condArgs.get("minLimAttr"));
      } else if (condArgs.containsKey("maxLimAttr")) {
        c.type = AttrCondPro.Type.MAX_LIM_ATTR;
        c.matchAttr = String.valueOf(condArgs.get("maxLimAttr"));
      } else if (condArgs.containsKey("min")) {
        c.type = AttrCondPro.Type.MIN;
        c.matchAttr = String.valueOf(condArgs.get("min"));
      } else if (condArgs.containsKey("max")) {
        c.type = AttrCondPro.Type.MAX;
        c.matchAttr = String.valueOf(condArgs.get("max"));
      }

      attrConds.add(c);
    }

    rc3.filters = attrConds;
  }
}
