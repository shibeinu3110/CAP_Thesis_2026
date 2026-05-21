package org.tzi.use.useCap.metamodel.retake_constraint;

public interface RetakeConstraintGenerator<T extends RetakeConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
