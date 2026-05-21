package org.tzi.use.useCap.metamodel.status_constraint.type5;

import org.tzi.use.useCap.metamodel.status_constraint.StatusConstraintParser;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECK_STATUS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.useCap.util.ParserUtil.parseCheckForExi;
import static org.tzi.use.useCap.util.ParserUtil.parseIfPart;

public class StatusConstraintType5Parser implements StatusConstraintParser<StatusConstraintType5> {

  @Override
  public StatusConstraintType5 parse(Map<String, Object> astJson) {
    for (Map.Entry<String, Object> entry : astJson.entrySet()) {
      System.out.println("AST JSON Entry: " + entry.getKey() + " -> " + entry.getValue() + " " + entry.getValue().getClass());
    }

    StatusConstraintType5 sc5 = new StatusConstraintType5();

    System.out.println("Parsing StatusConstraintType5...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    sc5.assocCls = (String) args.get(ASSOC_CLS);
    sc5.rolePath = (String) args.get(ROLE_PATH);

    sc5.ifParts = parseIfPart(astJson);
    System.out.println("Parsed ifParts: " + sc5.ifParts);

    // check status
    sc5.checkStatus = parseCheckForExi(args, CHECK_STATUS);
    System.out.println("Parsed checkStatus: " + sc5.checkStatus);

    return sc5;
  }
}
