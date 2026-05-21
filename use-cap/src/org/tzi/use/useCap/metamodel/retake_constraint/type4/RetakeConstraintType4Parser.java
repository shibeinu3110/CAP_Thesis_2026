package org.tzi.use.useCap.metamodel.retake_constraint.type4;

import org.tzi.use.useCap.metamodel.retake_constraint.RetakeConstraintParser;
import org.tzi.use.useCap.util.ParserUtil;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.TARGET_ASSOC;

public class RetakeConstraintType4Parser implements RetakeConstraintParser<RetakeConstraintType4> {

  @Override
  public RetakeConstraintType4 parse(Map<String, Object> astJson) {
    RetakeConstraintType4 rc4 = new RetakeConstraintType4();

    System.out.println("Parsing RetakeConstraintType4...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    // assocCls and rolePath
    rc4.assocCls = (String) args.get(ASSOC_CLS);
    rc4.rolePath = (String) args.get(ROLE_PATH);
    rc4.targetAssoc = (String) args.get(TARGET_ASSOC);

    // if parts
    rc4.ifParts = ParserUtil.parseIfPart(astJson);

    // check for existence parts
    rc4.checkForExi = ParserUtil.parseCheckForExi(args, null);

    // exists part
    rc4.checkForExi2 = ParserUtil.parseCheckForExi(args, "checkForExi2");

    return rc4;
  }
}
