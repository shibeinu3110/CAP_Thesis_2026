package org.tzi.use.useCap.metamodel.prerequisite_constraint;

public interface PrerequisiteConstraintGenerator<T extends PrerequisiteConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
