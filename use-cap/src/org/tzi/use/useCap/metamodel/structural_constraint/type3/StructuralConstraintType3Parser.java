package org.tzi.use.useCap.metamodel.structural_constraint.type3;

import org.tzi.use.useCap.metamodel.structural_constraint.StructuralConstraintParser;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ASSOC_CLS;

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
