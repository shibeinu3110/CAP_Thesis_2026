package org.tzi.use.useCap.metamodel.time_constraint.type5;

import org.tzi.use.useCap.metamodel.time_constraint.TimeConstraintGenerator;

import static org.tzi.use.useCap.util.GeneratorUtils.buildIfCondition;

public class TimeConstraintType5Generator implements TimeConstraintGenerator<TimeConstraintType5> {
  @Override
  public String generate(String contextClass, String invariantName, TimeConstraintType5 tc5) {
    System.out.println("Generating TimeConstraintType5...");

    // ---- IF PART ----
    String ifCond = buildIfCondition(tc5.ifParts, null);
    String impliesPart = (ifCond == null) ? "" : ifCond + " implies ";
    boolean hasIfPart = ifCond != null && !ifCond.isBlank();

    // ---- CHECK FOR NON-EXISTENCE ----
    String checkForExi = String.format(
        "self.%s->isEmpty()",
        tc5.targetAssoc
    );

    // ---- BODY ----
    String body =
        hasIfPart
            ? """
            %s(
              %s
            )
            """.formatted(impliesPart, checkForExi)
            : checkForExi;

    return """
        context %s
        inv %s:
          %s
        """.formatted(
        contextClass,
        invariantName,
        body
    );
  }
}
