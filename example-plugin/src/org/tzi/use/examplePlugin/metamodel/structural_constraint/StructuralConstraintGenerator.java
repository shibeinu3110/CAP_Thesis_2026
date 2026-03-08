package org.tzi.use.examplePlugin.metamodel.structural_constraint;

public interface StructuralConstraintGenerator<T extends StructuralConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
