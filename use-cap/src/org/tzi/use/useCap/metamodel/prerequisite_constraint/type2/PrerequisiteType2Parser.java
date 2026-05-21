package org.tzi.use.useCap.metamodel.prerequisite_constraint.type2;

import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECKED_ROLE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;

public class PrerequisiteType2Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType2> {

  @Override
  public PrerequisiteConstraintType2 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType2 pr2 = new PrerequisiteConstraintType2();

    System.out.println("Parsing PrerequisiteConstraintType2...");

    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr2.assocCls = (String) args.get(ASSOC_CLS);
    pr2.rolePath = (String) args.get(ROLE_PATH);
    pr2.checkedRole = (String) args.get(CHECKED_ROLE);

    // Validate required arguments
    if (pr2.assocCls == null || pr2.rolePath == null || pr2.checkedRole == null) {
      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType2");
    }

    return pr2;
  }
}
