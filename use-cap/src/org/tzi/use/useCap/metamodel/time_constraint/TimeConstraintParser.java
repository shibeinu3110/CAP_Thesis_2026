package org.tzi.use.useCap.metamodel.time_constraint;

import java.util.Map;

public interface TimeConstraintParser<T extends TimeConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
