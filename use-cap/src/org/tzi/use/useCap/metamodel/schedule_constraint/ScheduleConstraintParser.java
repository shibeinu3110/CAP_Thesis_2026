package org.tzi.use.useCap.metamodel.schedule_constraint;

import java.util.Map;

public interface ScheduleConstraintParser<T extends ScheduleConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
