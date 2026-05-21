package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint;

import java.util.Map;

public interface PrerequisiteConstraintParser<T extends PrerequisiteConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
