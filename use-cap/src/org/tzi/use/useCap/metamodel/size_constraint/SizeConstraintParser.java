package org.tzi.use.useCap.metamodel.size_constraint;

import java.util.Map;

public interface SizeConstraintParser<T extends SizeConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
