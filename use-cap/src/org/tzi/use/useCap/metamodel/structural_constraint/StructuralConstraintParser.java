package org.tzi.use.useCap.metamodel.structural_constraint;

import java.util.Map;

public interface StructuralConstraintParser<T extends StructuralConstraintInterface> {
  T parse(Map<String, Object> astJson);
}
