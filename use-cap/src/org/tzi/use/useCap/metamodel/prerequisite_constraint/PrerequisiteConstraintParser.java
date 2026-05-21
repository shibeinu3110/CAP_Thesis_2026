package org.tzi.use.useCap.metamodel.prerequisite_constraint;

import java.util.Map;

public interface PrerequisiteConstraintParser<T extends PrerequisiteConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
