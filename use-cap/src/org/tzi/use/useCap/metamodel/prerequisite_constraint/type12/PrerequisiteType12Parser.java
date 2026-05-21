package org.tzi.use.useCap.metamodel.prerequisite_constraint.type12;

import org.tzi.use.useCap.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;
import org.tzi.use.useCap.util.ParserUtil;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.REQUIRES;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;

public class PrerequisiteType12Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType12> {

  @Override
  public PrerequisiteConstraintType12 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType12 pr12 = new PrerequisiteConstraintType12();


    System.out.println("--- Parsing PrerequisiteConstraintType12 ---");
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    pr12.assocCls = (String) args.get(ASSOC_CLS);
    pr12.rolePath = (String) args.get(ROLE_PATH);

    pr12.ifParts = ParserUtil.parseIfPart(astJson);
    pr12.requires = ParserUtil.parseCheckForExi(args, REQUIRES);

    if (pr12.assocCls == null
        || pr12.rolePath == null
        || pr12.ifParts == null
        || pr12.ifParts.isEmpty()
        || pr12.requires == null
        || pr12.requires.isEmpty()) {

      throw new IllegalArgumentException("Missing required arguments for PrerequisiteConstraintType12");
    }

    return pr12;
  }
}
