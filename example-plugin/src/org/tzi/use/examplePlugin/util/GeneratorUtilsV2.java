package org.tzi.use.examplePlugin.util;

import org.jetbrains.annotations.Nullable;
import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.OperatorValue;
import org.tzi.use.examplePlugin.metamodel.eligibility_constraint.RootScope;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.tzi.use.examplePlugin.util.UseUtils.isNumber;
import static org.tzi.use.examplePlugin.util.constant.GeneratorConstant.*;

/**
 * Utility class for code generation, especially for generating condition strings based on IfPart.
 * This class is created only to handle the new logic for RetakeConstraint, and we want to keep the original GeneratorUtils clean and unchanged for now.
 */

public class GeneratorUtilsV2 {
  /**
   * If parts to condition string
   * <p>
   * In this case, accept an ifParts list and a root prefix, and generate a condition string with reference.
   * <p>
   * E.g: @AttrCond(attr="failedAttempts", min=2)  --> the passed param is
   * <p>
   * ifParts, rootPrefix = SELF, referenceClass = c
   * <p>
   * generate condition string: self.failedAttempts(c) >= 2
   *
   * @param ifParts
   * @return
   */
  public static String buildIfConditionWithReference(List<IfPart> ifParts, String rootPrefix, String referenceClass) {

    if (ifParts == null || ifParts.isEmpty()) {
      return null;
    }

    String resolvedRoot =
        (rootPrefix == null || rootPrefix.isEmpty())
            ? SELF
            : rootPrefix;

    return ifParts.stream()
        .map(c -> {
          String cond;

          // CASE 1: if refs is specified, use refs to build the condition
          if (/*c.refs != null && !c.refs.isEmpty() &&*/ c.operatorAndValue != null) {
            cond = parseByRefs(c, resolvedRoot, referenceClass);
          }
          // CASE 2: default parse
          else {
            cond = parseByFixType(c, resolvedRoot, referenceClass);
          }
          return c.negated ? "not (" + cond + RIGHT_BRACKET : cond;
        })
        .collect(Collectors.joining(AND));
  }

  private static String parseByRefs(IfPart c, String root, String referenceClass) {
    System.out.println("Parsing by refs for IfPart: " + c.ifFixValue + " with root: " + root);
    System.out.println("Calsize: " + c.calSize);

    // build left hand side path: self.course.credits or e.course.credits
    String left = String.join(DOT, root, c.ifAttr);

    // calSize
    if (c.calSize != null && c.calSize) {
      left = left + "->size()";
    }

    // reference class
    if (referenceClass != null && !referenceClass.isEmpty()) {
      left = left + LEFT_BRACKET + referenceClass + RIGHT_BRACKET;
    }

    // build right hand side path
    // String right = root + DOT + String.join(DOT, c.refs);
    String right = root;

    if (c.refs != null && !c.refs.isEmpty()) {
      right = right + DOT + String.join(DOT, c.refs);
    }
    right = right + (c.ifFixValue.isEmpty() ? "" : (DOT + c.ifFixValue));

    if (c.operatorAndValue != null) {
      right = right + " " + renderOperatorValue(c.operatorAndValue);
    }

    String cond;
    switch (c.ifFixType) {
      case MIN_LIM, MIN_LIM_ATTR, MIN_VALUE, MIN -> cond = left + GREATER_THAN + right;

      case MAX_LIM, MAX_LIM_ATTR, MAX_VALUE, MAX -> cond = left + LESS_THAN + right;

      case MATCH_ATTR, FIX_ATTR -> cond = left + " = " + right;

      case FIX_BOOL -> cond = Boolean.parseBoolean(c.ifFixValue)
          ? left
          : "not " + left;

      case FIX_STR, FIX_ENUM -> cond = left + " = '" + c.ifFixValue + "'";

      default -> throw new RuntimeException("Unsupported AttrCondPro type: " + c.ifFixType);
    }

    return c.negated ? "not (" + cond + RIGHT_BRACKET : cond;
  }


  private static String parseByFixType(IfPart c, String root, String referenceClass) {
    System.out.println("Parsing by fix type for IfPart: " + c.ifFixValue + " with root: " + root);
    System.out.println("ifAttr: " + c.ifAttr + ", ifFixType: " + c.ifFixType + ", ifFixValue: " + c.ifFixValue);
    System.out.println("Calsize: " + c.calSize);

    // calSize
    if (c.calSize != null && c.calSize) {
      root = root + DOT + c.ifAttr + "->size()";
    } else if (referenceClass != null && !referenceClass.isEmpty()) {
      root = root + DOT + c.ifAttr + LEFT_BRACKET + referenceClass + RIGHT_BRACKET;

    } else {
      root = root + DOT + c.ifAttr;
    }

    return switch (c.ifFixType) {
      case FIX_NUM, FIX_BOOL, FIX_ATTR -> root + " = " + c.ifFixValue;

      case FIX_STR, FIX_ENUM -> root + " = '" + c.ifFixValue + "'";

      case MAX_LIM, MAX, MAX_VALUE -> root + " <= " + c.ifFixValue;

      case MIN_LIM, MIN, MIN_VALUE -> root + " >= " + c.ifFixValue;

      default -> throw new RuntimeException("Invalid ifPart");
    };
  }

  /**
   * Normalize operator
   */
  private static String renderOperatorValue(OperatorValue ov) {
    String operator = ov.getOperator();
    Object value = ov.getValue();

    if (value instanceof Number) {
      double v = ((Number) value).doubleValue();

      if (v < 0) {
        operator = invertOperator(operator);
        v = Math.abs(v);

        if (value instanceof Integer || value instanceof Long) {
          return operator + " " + (long) v;
        }
        return operator + " " + v;
      }
    }

    return operator + " " + value;
  }

  private static String invertOperator(String operator) {
    return switch (operator) {
      case "+" -> "-";
      case "-" -> "+";
      default -> operator;
    };
  }

  /**
   * Build exists check condition for a collection based on the given conditions.
   * @return
   */
  public static String buildExistsCheckConditionForRetake(
      String rolePath,
      AttrCondPro cond,
      String rootReferenceClass,
      String referenceClass
  ) {
    if (cond == null) {
      return "true";
    }

    String left = rolePath + DOT + String.join(DOT, cond.attrs);

    String right = referenceClass + "|" + referenceClass + DOT + cond.insideExistValue + "=" + rootReferenceClass;

    return left + "->exists(" + right + RIGHT_BRACKET;
  }


  /**
   * Build allowed condition for retake based on the given filters and scope.
   * @param filters
   * @param scope
   * @param iterator
   * @return
   */
  public static String buildAllowedConditionForRetake(
      List<AttrCondPro> filters,
      RootScope scope,
      @Nullable String iterator,
      String referenceClass
  ) {
    System.out.println("Building allowed condition for filters: " + filters + " with scope: " + scope);
    int lastIndex = filters.size() - 1;
    System.out.println("Last index: " + lastIndex);

    return IntStream.range(0, filters.size())
        .mapToObj(i -> buildSingleAllowedCondition(
            filters.get(i),
            scope,
            i == lastIndex,
            i == 0,
            iterator,
            referenceClass
        ))
        .collect(Collectors.joining(AND));
  }
  private static String buildSingleAllowedCondition(
      AttrCondPro c,
      RootScope scope,
      boolean isLast,
      boolean isFirst,
      @Nullable String iterator,
      String referenceClass
  ) {

    System.out.println("Condition type is: " + c.type);
    String root;
    boolean hasIterator = iterator != null && !iterator.isEmpty();

    switch (scope) {
      case ALL -> root = SELF;

      case LAST_ONLY -> {
        if (isLast) root = SELF;
        else root = hasIterator ? iterator : "e";
      }

      case FIRST_ONLY -> {
        if (isFirst && hasIterator) root = iterator;
        else root = SELF;
      }

      default -> root = hasIterator ? iterator : "e";
    }

    String right = "";
    if (c.scale != null && !c.scale.isEmpty()) {
      right = c.scale + " * " + root + DOT + c.attrs.get(0) + DOT + c.matchAttr;
    } else if (isNumber(c.matchAttr)
        || c.type == AttrCondPro.Type.MIN_LIM
        || c.type == AttrCondPro.Type.MAX_LIM) {
      // in case matchAttr is a number or it's a limit, we treat it as a value, not a path
      right = c.matchAttr.toString();
    } else {
      right = root + DOT + c.matchAttr;
    }

    // build left hand side path: self.course.credits or e.course.credits
    String path = root + DOT + String.join(DOT, c.attrs);
    if (referenceClass != null && !referenceClass.isEmpty()) {
      path = path + LEFT_BRACKET + referenceClass + RIGHT_BRACKET;
    }

    // in case c.type is null, (like we only have attr=value and attr2=value2), we will treat it as path
    if (c.type == null) {
      return path;
    }

    String cond;
    switch (c.type) {
      case MIN_LIM, MIN_LIM_ATTR, MIN -> cond = path + LESS_THAN + right;

      case MAX_LIM, MAX_LIM_ATTR, MAX -> cond = path + GREATER_THAN + right;

      case MATCH_ATTR ->  cond = path + " = " + right;

      case FIX_BOOL -> cond = Boolean.parseBoolean(c.matchAttr.toString())
          ? path
          : "not " + path;

      case MATCH_STR, FIX_ENUM, FIX_STR -> cond = path + " = '" + c.matchAttr + "'";

      default -> throw new RuntimeException("Unsupported AttrCondPro type: " + c.type);
    }

    return cond;
  }
}
