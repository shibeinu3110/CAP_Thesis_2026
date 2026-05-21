package org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.type5;

import org.tzi.use.examplePlugin.metamodel.RelationCond;
import org.tzi.use.examplePlugin.metamodel.prerequisite_constraint.PrerequisiteConstraintGenerator;

import java.util.List;

public class PrerequisiteConstraintType5Generator implements PrerequisiteConstraintGenerator<PrerequisiteConstraintType5> {
  @Override
  public String generate(String contextClass, String invariantName, PrerequisiteConstraintType5 pr5) {

    // validate
    validate(pr5);

    // build condition (e2.xxx = c AND e2.xxx = e.xxx)
    String condition = buildCondition(pr5.relations);

    return """
    context %s
    inv %s:
      self.%s->forAll(e |
        e.%s.%s->forAll(c |
          self.%s->exists(e2 |
            %s
          )
        )
      )
    """.formatted(
        contextClass,
        invariantName,
        pr5.assocCls,
        pr5.rolePath,
        pr5.checkedRole,
        pr5.assocCls,
        indent(condition, 12)
    );
  }

  private String buildCondition(List<RelationCond> conds) {
    if (conds == null || conds.isEmpty()) {
      throw new IllegalArgumentException("Relation conditions must not be empty");
    }

    return conds.stream()
        .map(this::buildSingleRelation)
        .reduce((a, b) -> a + "\n            and " + b)
        .orElse("");
  }

  /**
   * Build single relation expression
   * Example: e2.semester = e.offering.semester
   */
  private String buildSingleRelation(RelationCond r) {

    String left = r.leftRoot + "." + r.leftPath;

    String right = r.rightRoot;
    if (r.rightPath != null && !r.rightPath.isEmpty()) {
      right += "." + r.rightPath;
    }

    return left + " " + r.operator + " " + right;
  }

  /**
   * Validate input to avoid runtime bug
   */
  private void validate(PrerequisiteConstraintType5 pr) {
    if (pr.assocCls == null || pr.assocCls.isEmpty()) {
      throw new IllegalArgumentException("assocCls is required");
    }
    if (pr.rolePath == null || pr.rolePath.isEmpty()) {
      throw new IllegalArgumentException("rolePath is required");
    }
    if (pr.checkedRole == null || pr.checkedRole.isEmpty()) {
      throw new IllegalArgumentException("checkedRole is required");
    }
  }

  /**
   * indent helper
   */
  private String indent(String s, int spaces) {
    String pad = " ".repeat(spaces);
    return s.lines()
        .map(line -> pad + line)
        .reduce((a, b) -> a + "\n" + b)
        .orElse("");
  }
}
