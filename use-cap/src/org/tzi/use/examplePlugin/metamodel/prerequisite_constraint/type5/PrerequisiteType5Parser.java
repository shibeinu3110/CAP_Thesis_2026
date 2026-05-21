package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type5;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;
import org.tzi.use.examplePlugin.util.ParserUtil;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ROLE_PATH;

public class PrerequisiteType5Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType5> {

  @Override
  public PrerequisiteConstraintType5 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType5 pr5 = new PrerequisiteConstraintType5();

    System.out.println("Parsing PrerequisiteConstraintType5...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr5.checkedRole = (String) args.get(CHECKED_ROLE);
    pr5.assocCls = (String) args.get(ASSOC_CLS);
    pr5.rolePath = (String) args.get(ROLE_PATH);

    pr5.relations = ParserUtil.parseRelationConds(args);
    // Validate required arguments
    if (pr5.checkedRole == null || pr5.assocCls == null || pr5.rolePath == null) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType5");
    }

    return pr5;
  }
}
