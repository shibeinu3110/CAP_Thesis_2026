package org.tzi.use.examplePlugin.metamodel.retake_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintGenerator;

import static org.tzi.use.examplePlugin.util.GeneratorUtilsV2.buildAllowedConditionForRetake;
import static org.tzi.use.examplePlugin.util.GeneratorUtilsV2.buildExistsCheckConditionForRetake;
import static org.tzi.use.examplePlugin.util.GeneratorUtilsV2.buildIfConditionWithReference;

public class RetakeConstraintType3Generator implements RetakeConstraintGenerator<RetakeConstraintType3> {
  @Override
  public String generate(String contextClass, String invariantName, RetakeConstraintType3 rc3) {

    String var1 = "c";
    String var2 = "e";


    String forAll = buildAllowedConditionForRetake(
        rc3.filters,
        RootScope.ALL,
        null,
        var1
    );

    return """
        context %s inv %s:
            %s.%s->forAll(%s |
                %s
            )
        """.formatted(
        contextClass,
        invariantName,
        rc3.rolePath,
        rc3.targetAssoc,
        var1,
        forAll
    );
  }
}
