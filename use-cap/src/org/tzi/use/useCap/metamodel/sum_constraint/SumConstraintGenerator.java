package org.tzi.use.useCap.metamodel.sum_constraint;

public interface SumConstraintGenerator<T extends SumConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T sc
    );
}
