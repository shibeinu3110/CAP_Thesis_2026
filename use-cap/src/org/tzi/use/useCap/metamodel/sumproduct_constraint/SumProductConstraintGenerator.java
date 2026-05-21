package org.tzi.use.useCap.metamodel.sumproduct_constraint;

public interface SumProductConstraintGenerator<T extends SumProductConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
