package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type11;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECK_EXEC;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CROSS_REFERENCE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ROLE_PATH;

public class PrerequisiteType11Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType11> {

  @Override
  public PrerequisiteConstraintType11 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType11 pr11 = new PrerequisiteConstraintType11();

    System.out.println("Parsing PrerequisiteConstraintType11...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr11.assocCls = (String) args.get(ASSOC_CLS);
    pr11.checkedRole = (String) args.get(CHECKED_ROLE);
    pr11.rolePath = (String) args.get(ROLE_PATH);

    pr11.crossReference = (Boolean) args.getOrDefault(CROSS_REFERENCE, false);
    pr11.checkExec = (Boolean) args.getOrDefault(CHECK_EXEC, false);

    // Validate required arguments
    if (pr11.checkedRole == null
        || pr11.assocCls == null
        || pr11.rolePath == null || !pr11.crossReference || !pr11.checkExec) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType11");
    }

    return pr11;
  }
}
