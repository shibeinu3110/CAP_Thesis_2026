package org.tzi.use.useCap.metamodel.time_constraint;

public interface TimeConstraintGenerator<T extends TimeConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
