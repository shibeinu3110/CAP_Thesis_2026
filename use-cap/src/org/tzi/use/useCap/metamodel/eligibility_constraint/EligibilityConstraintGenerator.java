package org.tzi.use.useCap.metamodel.eligibility_constraint;

public interface EligibilityConstraintGenerator<T extends EligibilityConstraintInterface> {
    String generate(
        String contextClass,
        String invariantName,
        T ec
    );
}
