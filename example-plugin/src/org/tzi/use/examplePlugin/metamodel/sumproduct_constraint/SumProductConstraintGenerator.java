package org.tzi.use.examplePlugin.metamodel.sumproduct_constraint;

public interface SumProductConstraintGenerator<T extends SumProductConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
