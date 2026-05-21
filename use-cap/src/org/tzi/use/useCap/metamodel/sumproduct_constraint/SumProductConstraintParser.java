package org.tzi.use.useCap.metamodel.sumproduct_constraint;

import java.util.Map;

public interface SumProductConstraintParser<T extends SumProductConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
