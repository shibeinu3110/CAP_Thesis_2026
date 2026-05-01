package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type2;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintParser;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintParser;
import org.tzi.use.examplePlugin.util.ParserUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.COLLECT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.TARGET_ASSOC;
import static org.tzi.use.examplePlugin.util.UseUtils.asString;

public class PrerequisiteType2Parser implements PrerequisiteConstraintParser<PrerequisiteConstraintType2> {

  @Override
  public PrerequisiteConstraintType2 parse(Map<String, Object> astJson) {
    PrerequisiteConstraintType2 rc1 = new PrerequisiteConstraintType2();

    System.out.println("Parsing PrerequisiteConstraintType2...");


    return rc1;
  }
}
