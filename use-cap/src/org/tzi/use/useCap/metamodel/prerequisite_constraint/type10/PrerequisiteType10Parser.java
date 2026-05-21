package org.tzi.use.useCap.metamodel.prerequisite_constraint.type10;

import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;
import org.tzi.use.useCap.util.ParserUtil;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.REQUIRE_EXIST;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;

public class PrerequisiteType10Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType10> {

  @Override
  public PrerequisiteConstraintType10 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType10 pr10 = new PrerequisiteConstraintType10();

    System.out.println("Parsing PrerequisiteConstraintType10...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr10.assocCls = (String) args.get(ASSOC_CLS);
    pr10.checkedRole = (String) args.get(CHECKED_ROLE);
    pr10.rolePath = (String) args.get(ROLE_PATH);

    pr10.requireExists = ParserUtil.parseCheckForExi(args, REQUIRE_EXIST);

    // Validate required arguments
    if (pr10.checkedRole == null || pr10.assocCls == null || pr10.rolePath == null) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType10");
    }

    return pr10;
  }
}
