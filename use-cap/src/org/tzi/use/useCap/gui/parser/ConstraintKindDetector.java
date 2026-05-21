package org.tzi.use.useCap.gui.parser;

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
      case "prerequisiteconstraint" -> ConstraintKind.PREREQUISITE;
      case "sumproductconstraint" -> ConstraintKind.SUM_PRODUCT;

      default -> ConstraintKind.UNKNOWN;
    };
  }
}
