package org.tzi.use.useCap.metamodel.status_constraint;

import java.util.Map;

public interface StatusConstraintParser<T extends StatusConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
