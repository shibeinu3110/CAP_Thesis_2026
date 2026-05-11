package org.tzi.use.examplePlugin.logic;

import org.tzi.use.examplePlugin.gui.parser.ConstraintKind;
import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.EligibilityConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.retake_constraint.RetakeConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.ScheduleConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.size_constraint.SizeConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.status_constraint.StatusConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.structural_constraint.StructuralConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.sum_constraint.SumConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.sumproduct_constraint.SumProductConstraintDetector;
import org.tzi.use.examplePlugin.metamodel.time_constraint.TimeConstraintDetector;

import java.util.EnumMap;
import java.util.Map;

public class ConstraintRegistry {

  private static final Map<ConstraintKind, ConstraintHandler> MAP = new EnumMap<>(ConstraintKind.class);

  static {
    MAP.put(ConstraintKind.TIME, new TimeConstraintDetector());
    MAP.put(ConstraintKind.SUM, new SumConstraintDetector());
    MAP.put(ConstraintKind.SIZE, new SizeConstraintDetector());
    MAP.put(ConstraintKind.ELIGIBILITY, new EligibilityConstraintDetector());
    MAP.put(ConstraintKind.SCHEDULE, new ScheduleConstraintDetector());
    MAP.put(ConstraintKind.STATUS, new StatusConstraintDetector());
    MAP.put(ConstraintKind.RETAKE, new RetakeConstraintDetector());
    MAP.put(ConstraintKind.STRUCTURAL, new StructuralConstraintDetector());
    MAP.put(ConstraintKind.PREREQUISITE, new PrerequisiteConstraintDetector());
    MAP.put(ConstraintKind.SUM_PRODUCT, new SumProductConstraintDetector());
  }

  public static ConstraintHandler get(ConstraintKind kind) {
    return MAP.get(kind);
  }
}