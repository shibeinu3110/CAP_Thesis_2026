package org.tzi.use.examplePlugin.metamodel.structural_constraint.type1;

import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintParser;
import org.tzi.use.examplePlugin.util.ParserUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_STRUCTURE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.COLLECT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.TARGET_ASSOC;
import static org.tzi.use.examplePlugin.util.ParserUtil.parseCheckForExi;
import static org.tzi.use.examplePlugin.util.UseUtils.asString;

public class StructuralConstraintType1Parser implements StructuralConstraintParser<StructuralConstraintType1> {

  @Override
  public StructuralConstraintType1 parse(Map<String, Object> astJson) {
    StructuralConstraintType1 rc1 = new StructuralConstraintType1();

    System.out.println("Parsing StructuralConstraintType1...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    // assocCls and rolePath
    rc1.assocCls = (String) args.get(ASSOC_CLS);
    rc1.rolePath = (String) args.get(ROLE_PATH);

    rc1.checkStructure = parseCheckForExi(args, CHECK_STRUCTURE);

    return rc1;
  }
}
