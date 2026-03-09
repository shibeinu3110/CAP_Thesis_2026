package org.tzi.use.examplePlugin.gui.parser;

import org.tzi.use.examplePlugin.ast.ASTInterface;

public class ConstraintKindDetector {

  public static ConstraintKind detect(String type) {
    return switch (type.toLowerCase()) {
      case "timeconstraint" -> ConstraintKind.TIME;
      case "sumconstraint" -> ConstraintKind.SUM;
      case "scheduleconstraint" -> ConstraintKind.SCHEDULE;
      case "sizeconstraint" -> ConstraintKind.SIZE;
      case "eligibilityconstraint" -> ConstraintKind.ELIGIBILITY;
      case "statusconstraint" -> ConstraintKind.STATUS;
      case "retakeconstraint" -> ConstraintKind.RETAKE;
      case "structuralconstraint" -> ConstraintKind.STRUCTURAL;

      default -> ConstraintKind.UNKNOWN;
    };
  }
}
