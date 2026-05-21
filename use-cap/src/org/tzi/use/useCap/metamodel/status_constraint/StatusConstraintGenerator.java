package org.tzi.use.useCap.metamodel.status_constraint;

public interface StatusConstraintGenerator<T extends StatusConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
