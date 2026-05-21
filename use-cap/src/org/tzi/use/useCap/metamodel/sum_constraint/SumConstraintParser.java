package org.tzi.use.useCap.metamodel.sum_constraint;

import java.util.Map;

public interface SumConstraintParser <T extends SumConstraintInterface> {
    T parse(Map<String, Object> astJson);
}
