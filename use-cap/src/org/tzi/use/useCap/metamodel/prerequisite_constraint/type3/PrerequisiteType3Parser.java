package org.tzi.use.useCap.metamodel.prerequisite_constraint.type3;

import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;
import org.tzi.use.useCap.util.ParserUtil;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.REQUIRES;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;

public class PrerequisiteType3Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType3> {

  @Override
  public PrerequisiteConstraintType3 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType3 pr3 = new PrerequisiteConstraintType3();

    System.out.println("Parsing PrerequisiteConstraintType3...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr3.assocCls = (String) args.get(ASSOC_CLS);
    pr3.rolePath = (String) args.get(ROLE_PATH);
    pr3.checkedRole = (String) args.get(CHECKED_ROLE);

    // Parse the "requires" attribute using the utility method
    pr3.requires = ParserUtil.parseCheckForExi(args, REQUIRES);

    // Validate required arguments
    if (pr3.assocCls == null || pr3.rolePath == null || pr3.checkedRole == null || pr3.requires == null) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType3");
    }

    return pr3;
  }
}
