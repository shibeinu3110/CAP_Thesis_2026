package org.tzi.use.useCap.metamodel.structural_constraint.type2;

import org.tzi.use.useCap.metamodel.structural_constraint.StructuralConstraintParser;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.CHECK_STRUCTURE;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.useCap.util.ParserUtil.parseCheckForExi;

public class StructuralConstraintType2Parser implements StructuralConstraintParser<StructuralConstraintType2> {

  @Override
  public StructuralConstraintType2 parse(Map<String, Object> astJson) {
    StructuralConstraintType2 sc2 = new StructuralConstraintType2();

    System.out.println("Parsing StructuralConstraintType2...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    // assocCls and rolePath
    sc2.assocCls = (String) args.get(ASSOC_CLS);
    sc2.rolePath = (String) args.get(ROLE_PATH);

    sc2.checkStructure = parseCheckForExi(args, CHECK_STRUCTURE);

    return sc2;
  }
}
