package org.tzi.use.useCap.metamodel.prerequisite_constraint.type7;

import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.NO_SELF;

public class PrerequisiteType7Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType7> {

  @Override
  public PrerequisiteConstraintType7 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType7 pr7 = new PrerequisiteConstraintType7();

    System.out.println("Parsing PrerequisiteConstraintType7...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr7.checkedRole = (String) args.get(CHECKED_ROLE);
    pr7.noSelf = (Boolean) args.get(NO_SELF);

    // Validate required arguments
    if (pr7.checkedRole == null || pr7.noSelf == null || !pr7.noSelf) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType7");
    }

    return pr7;
  }
}
