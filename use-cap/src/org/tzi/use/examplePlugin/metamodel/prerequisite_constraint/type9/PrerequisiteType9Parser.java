package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type9;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.MAX_DEPTH_LIMIT;

public class PrerequisiteType9Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType9> {

  @Override
  public PrerequisiteConstraintType9 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType9 pr9 = new PrerequisiteConstraintType9();

    System.out.println("Parsing PrerequisiteConstraintType9...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr9.checkedRole = (String) args.get(CHECKED_ROLE);
    pr9.maxDepthLimit = (Integer) args.get(MAX_DEPTH_LIMIT);

    // Validate required arguments
    if (pr9.checkedRole == null || pr9.maxDepthLimit == null) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType9");
    }

    return pr9;
  }
}
