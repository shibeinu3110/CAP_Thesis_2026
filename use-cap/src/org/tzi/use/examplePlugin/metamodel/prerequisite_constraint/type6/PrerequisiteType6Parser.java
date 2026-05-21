package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type6;

import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.NO_SELF;

public class PrerequisiteType6Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType6> {

  @Override
  public PrerequisiteConstraintType6 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType6 pr6 = new PrerequisiteConstraintType6();

    System.out.println("Parsing PrerequisiteConstraintType6...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr6.checkedRole = (String) args.get(CHECKED_ROLE);
    pr6.noSelf = (Boolean) args.get(NO_SELF);

    // Validate required arguments
    if (pr6.checkedRole == null || pr6.noSelf == null || !pr6.noSelf) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType6");
    }

    return pr6;
  }
}
