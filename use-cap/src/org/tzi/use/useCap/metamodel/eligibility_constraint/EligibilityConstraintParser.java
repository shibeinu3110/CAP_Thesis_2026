package org.tzi.use.useCap.metamodel.eligibility_constraint;

import java.util.Map;

public interface EligibilityConstraintParser<T extends EligibilityConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
