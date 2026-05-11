package org.tzi.use.examplePlugin.metamodel.structural_constraint.type1;

import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.CHECK_STRUCTURE;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.util.ParserUtil.parseCheckForExi;

public class StructuralConstraintType1Parser implements StructuralConstraintParser<StructuralConstraintType1> {

  @Override
  public StructuralConstraintType1 parse(Map<String, Object> astJson) {
    StructuralConstraintType1 sc1 = new StructuralConstraintType1();

    System.out.println("Parsing StructuralConstraintType1...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    // assocCls and rolePath
    sc1.assocCls = (String) args.get(ASSOC_CLS);
    sc1.rolePath = (String) args.get(ROLE_PATH);

    sc1.checkStructure = parseCheckForExi(args, CHECK_STRUCTURE);

    return sc1;
  }
}
