package org.tzi.use.examplePlugin.metamodel.structural_constraint.type4;

import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.TARGET_ASSOC;

public class StructuralConstraintType4Parser implements StructuralConstraintParser<StructuralConstraintType4> {

  @Override
  public StructuralConstraintType4 parse(Map<String, Object> astJson) {
    StructuralConstraintType4 sc4 = new StructuralConstraintType4();

    System.out.println("Parsing StructuralConstraintType4...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);

    // assocCls and rolePath
    sc4.assocCls = (String) args.get(ASSOC_CLS);
    sc4.rolePath = (String) args.get(ROLE_PATH);
    sc4.targetAssoc = (String) args.get(TARGET_ASSOC);

    return sc4;
  }
}
