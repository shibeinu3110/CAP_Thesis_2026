package org.tzi.use.examplePlugin.metamodel.structural_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.CHECK_STRUCTURE;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.util.ParserUtil.parseCheckForExi;

public class StructuralConstraintType3Parser implements StructuralConstraintParser<StructuralConstraintType3> {

  @Override
  public StructuralConstraintType3 parse(Map<String, Object> astJson) {
    StructuralConstraintType3 sc3 = new StructuralConstraintType3();

    System.out.println("Parsing StructuralConstraintType3...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    // assocCls and rolePath
    sc3.assocCls = (String) args.get(ASSOC_CLS);
    return sc3;
  }
}
