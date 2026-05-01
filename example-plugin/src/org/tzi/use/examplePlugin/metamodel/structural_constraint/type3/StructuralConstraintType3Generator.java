package org.tzi.use.examplePlugin.metamodel.structural_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.tzi.use.examplePlugin.util.GeneratorUtils.buildAllowedCondition;

public class StructuralConstraintType3Generator implements StructuralConstraintGenerator<StructuralConstraintType3> {
  @Override
  public String generate(String contextClass, String invariantName, StructuralConstraintType3 sc3) {

    System.out.println("Generating StructuralConstraintType3...");

    // get ite, if not, fallback to default value
    String ite = contextClass != null ? contextClass.charAt(0) + contextClass.substring(1).toLowerCase() : "e";

    return """
        context %s 
        inv %s:
          not self.%s -> closure(%s | %s.%s) -> includes(self)
        """.formatted(
        contextClass,
        invariantName,
        sc3.assocCls,
        ite,
        ite,
        sc3.assocCls
    );
  }
}
