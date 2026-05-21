package org.tzi.use.useCap.metamodel.size_constraint;

public interface SizeConstraintGenerator<T extends SizeConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
