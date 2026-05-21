package org.tzi.use.useCap.metamodel.retake_constraint;

import java.util.Map;

public interface RetakeConstraintParser<T extends RetakeConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
