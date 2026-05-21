package org.tzi.use.useCap.metamodel.structural_constraint;

public interface StructuralConstraintGenerator<T extends StructuralConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
