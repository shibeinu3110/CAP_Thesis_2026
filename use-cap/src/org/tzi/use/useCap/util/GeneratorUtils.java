package org.tzi.use.useCap.util;

import org.jetbrains.annotations.Nullable;
import org.tzi.use.useCap.metamodel.AttrCondPro;
import org.tzi.use.useCap.metamodel.IfPart;
import org.tzi.use.useCap.metamodel.OperatorValue;
import org.tzi.use.useCap.metamodel.RelationCond;
import org.tzi.use.useCap.metamodel.eligibility_constraint.RootScope;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.tzi.use.useCap.util.UseUtils.isNumber;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.AND;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.DOT;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.GREATER_THAN;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.LESS_THAN;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.OR;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.RIGHT_BRACKET;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.SELF;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.SELF_DOT;
import static org.tzi.use.useCap.util.constant.GeneratorConstant.SPACE;

public class GeneratorUtils {

  /**
   * If parts to condition string
   *
   * @param ifParts
   * @return
   */
  public static String buildIfCondition(List<IfPart> ifParts, String rootPrefix) {

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
            cond = parseByRefs(c, resolvedRoot);
          }
          // CASE 2: default parse
          else {
            cond = parseByFixType(c, resolvedRoot);
          }
          return c.negated ? "not (" + cond + RIGHT_BRACKET : cond;
        })
        .collect(Collectors.joining(AND));
  }

  private static String parseByRefs(IfPart c, String root) {
    System.out.println("Parsing by refs for IfPart: " + c.ifFixValue + " with root: " + root);
    System.out.println("Calsize: " + c.calSize);

    // build left hand side path: self.course.credits or e.course.credits
    String left = String.join(DOT, root, c.ifAttr);

    // calSize
    if (c.calSize != null && c.calSize) {
      left = left + "->size()";
    }

    // build right hand side path
    // String right = root + DOT + String.join(DOT, c.refs);
    String right = root;

    if (c.refs != null && !c.refs.isEmpty()) {
      right = right + DOT + String.join(DOT, c.refs);
    }
    right = right + (c.ifFixValue.isEmpty() ? "" : (DOT + c.ifFixValue));

    if (c.operatorAndValue != null) {
      right = right + SPACE + renderOperatorValue(c.operatorAndValue);
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


  private static String parseByFixType(IfPart c, String root) {
    System.out.println("Parsing by fix type for IfPart: " + c.ifFixValue + " with root: " + root);
    System.out.println("ifAttr: " + c.ifAttr + ", ifFixType: " + c.ifFixType + ", ifFixValue: " + c.ifFixValue);
    System.out.println("Calsize: " + c.calSize);

    // calSize
    if (c.calSize != null && c.calSize) {
      root = root + DOT + c.ifAttr + "->size()";
    } else {
      root = root + DOT + c.ifAttr;
    }

    return switch (c.ifFixType) {
      case FIX_NUM, FIX_BOOL, FIX_ATTR ->
          root + " = " + c.ifFixValue;

      case FIX_STR, FIX_ENUM ->
          root + " = '" + c.ifFixValue + "'";

      case MAX_LIM, MAX, MAX_VALUE ->
          root + " <= " + c.ifFixValue;

      case MIN_LIM, MIN, MIN_VALUE ->
          root + " >= " + c.ifFixValue;

      default ->
          throw new RuntimeException("Invalid ifPart");
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
          return operator + SPACE + (long) v;
        }
        return operator + SPACE + v;
      }
    }

    return operator + SPACE + value;
  }

  private static String invertOperator(String operator) {
    return switch (operator) {
      case "+" -> "-";
      case "-" -> "+";
      default -> operator;
    };
  }

  /**
   * Builds an OCL condition string from the given attribute conditions.
   * E.g: self.course.credits > 5 and self.course.isThesis = true
   * join with "and"
   *
   * @param filters
   * @param scope
   * @param isDerivedMode
   * @return
   */
  public static String buildAllowedCondition(
      List<AttrCondPro> filters,
      RootScope scope,
      @Nullable String iterator,
      boolean isDerivedMode) {
    System.out.println("Building allowed condition for filters: " + filters + " with scope: " + scope);
    int lastIndex = filters.size() - 1;
    System.out.println("Last index: " + lastIndex);

    return IntStream.range(0, filters.size())
        .mapToObj(i -> {
          AttrCondPro c = filters.get(i);
          if (c.excludesSelf) {
            System.out.println("Condition excludes self, skipping: " + c);
            return buildExcludeSelfCondition(c);
          } else if (c.isUndefined) {
            System.out.println("Condition is undefined, skipping: " + c);
            return buildAttrPath(c.attrs, null) + ".oclIsUndefined()";
          }

          return buildSingleAllowedCondition(
              c,
              // if scope is null, we treat it as ALL
              scope != null ? scope : RootScope.ALL,
              i == lastIndex,
              i == 0,
              iterator,
              isDerivedMode
          );
        })
        .collect(Collectors.joining(AND));
  }

  /**
   * Builds an OCL condition string from the given attribute conditions.
   * E.g: self.course.credits > 5 and self.course.isThesis = true
   * join with "or"
   * @param filters
   * @param scope
   * @return
   */
  public static String buildAllowedOrCondition(
      List<AttrCondPro> filters,
      RootScope scope,
      @Nullable String iterator
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
            false
        ))
        .collect(Collectors.joining(OR));
  }

  private static String buildSingleAllowedCondition(
      AttrCondPro c,
      RootScope scope,
      boolean isLast,
      boolean isFirst,
      @Nullable String iterator,
      boolean isDerivedMode) {

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
      right = "(" + c.scale + " * " + root + DOT + c.attrs.get(0) + DOT + c.matchAttr + RIGHT_BRACKET;
    } else if (isNumber(c.matchAttr)
        || c.type == AttrCondPro.Type.MIN_LIM
        || c.type == AttrCondPro.Type.MAX_LIM) {
      // in case matchAttr is a number or it's a limit, we treat it as a value, not a path
      right = c.matchAttr.toString();
    } else {
      String rightRoot = (c.refAttr != null && !c.refAttr.isEmpty())
          ? c.refAttr
          : root;

      right = rightRoot + DOT + c.matchAttr;
    }

    // build left hand side path: self.course.credits or e.course.credits
    String path;

    // derive is only for SumProduct constraint type 2
    if (isDerivedMode && c.attrs.size() > 1) {
      path = root + DOT + String.join(DOT, c.attrs.subList(1, c.attrs.size()));
    } else {
      path = root + DOT + String.join(DOT, c.attrs);
    }


    // in case c.type is null, (like we only have attr=value and attr2=value2), we will treat it as path
    if (c.type == null) {
      return path;
    }

    String cond;
    switch (c.type) {
      case MIN_LIM, MIN_LIM_ATTR, MIN, MIN_ATTR -> cond = path + GREATER_THAN + right;

      case MAX_LIM, MAX_LIM_ATTR, MAX, MAX_ATTR -> cond = path + LESS_THAN + right;

      case MATCH_ATTR ->  cond = path + " = " + right;

      case FIX_BOOL -> cond = Boolean.parseBoolean(c.matchAttr.toString())
          ? path
          : "not " + path;

      case MATCH_STR, FIX_ENUM, FIX_STR -> cond = path + " = '" + c.matchAttr + "'";

      case MATCH_OBJECT -> cond = path + " = " + c.matchAttr;

      default -> throw new RuntimeException("Unsupported AttrCondPro type: " + c.type);
    }

    return cond;
  }


  /**
   * Builds an OCL exists condition for the given collection and attribute conditions.
   * self.enrolments->exists(e | e.course.isThesis and e.course.credits > 5)
   *
   * @param collection
   * @param conds
   * @param iterator
   * @return
   */
  public static String buildExistsCheckCondition(
      String collection,
      List<AttrCondPro> conds,
      String iterator) {
    if (conds == null || conds.isEmpty()) {
      return "true";
    }

    String iter = (iterator == null || iterator.isBlank()) ? "e" : iterator;

    String body = buildAllowedCondition(conds, RootScope.NONE, !"e".equals(iter) ? iter : null, false);
    return SELF_DOT + collection + "->exists(" + iter + " | " + body + RIGHT_BRACKET;
  }

  /**
   * Builds an OCL exists condition for the given collection and attribute conditions.
   * self.enrolments->exists(e | e.course.isThesis) and self.enrolments->exists(e | e.course.credits > 5)
   * @param collection
   * @param conds
   * @param joinOp
   * @return
   */
  public static String buildExistsCheckConditionEach(
      String collection,
      List<AttrCondPro> conds,
      String joinOp
  ) {
    if (conds == null || conds.isEmpty()) {
      return "true";
    }

    return conds.stream()
        .map(c -> {
          String cond = buildSingleAllowedCondition(c, RootScope.NONE, true, false, null, false);
          return SELF_DOT + collection + "->exists(e | " + cond + RIGHT_BRACKET;
        })
        .collect(Collectors.joining(SPACE + joinOp + SPACE));
  }


  /**
   * Builds an OCL exists condition for the given collection and attribute conditions.
   * self.enrolments->exists(e
   * | e.course.isThesis)
   *
   * @param collection
   * @param conds
   * @return
   */
  public static String buildExistsIfCondition(
      String collection,
      List<IfPart> conds
  ) {
    String body = conds.stream()
        .map(c -> {
          String path = "e." + c.ifAttr;

          String cond;
          switch (c.ifFixType) {
            case FIX_BOOL -> cond = path;

            case FIX_NUM, FIX_ATTR, FIX_ENUM -> {
              if (c.ifFixValue == null) {
                throw new IllegalStateException(
                    "FIX_NUM/FIX_ATTR but ifFixValue is null for " + c.ifAttr
                );
              }
              cond = path + " = " + c.ifFixValue;
            }

            case FIX_STR -> {
              if (c.ifFixValue == null) {
                throw new IllegalStateException(
                    "FIX_STR but ifFixValue is null for " + c.ifAttr
                );
              }
              cond = path + " = '" + c.ifFixValue + "'";
            }

            case MIN_LIM, MIN_VALUE, MIN ->
              cond = path + " >= " + c.ifFixValue;

            case MAX_LIM, MAX_VALUE, MAX ->
              cond = path + " <= " + c.ifFixValue;

            default -> throw new RuntimeException(
                "Unsupported IfFixType: " + c.ifFixType
            );
          }

          return c.negated ? "not (" + cond + RIGHT_BRACKET : cond;
        })
        .collect(Collectors.joining(AND));

    return SELF_DOT + collection + "->exists(e | " + body + RIGHT_BRACKET;
  }


  /**
   * Builds an dot notation path from the given attribute list.
   * E.g: ["course", "isThesis"] -> "self.course.isThesis"
   */
  public static String buildAttrPath(
      List<String> attrs,
      String prefix
  ) {
    if (attrs == null || attrs.isEmpty()) {
      return prefix;
    }
    if (prefix != null) {
      prefix = prefix.trim() + DOT;
    }
    return prefix != null ? prefix + String.join(DOT, attrs) : String.join(DOT, attrs);
  }

  /**
   * Builds an OCL path with operator and value.
   * With ->size()
   * E.g: rolePath="advisor", targetCollection="students", symbol=">", value="5"
   * -> "self.advisor.students->size() > 5"
   * @param rolePath
   * @param targetCollection
   * @param symbol
   * @param value
   * @return
   */
  public static String buildSizePathWithOperator(
      String rolePath,
      String targetCollection,
      String symbol,
      Object value,
      String selectPart
  ) {
    String basePath =
        Objects.equals(rolePath, SELF)
            ? SELF_DOT + targetCollection
            : SELF_DOT + rolePath + DOT + targetCollection;

    String collectionExpr =
        basePath
            + (selectPart != null ? selectPart : "")
            + "->size()";

    // only add self. if rolePath is self and value is not number
    String right =
        !isNumber(value)
            ? SELF_DOT + value
            : value.toString();

    return collectionExpr  + SPACE + symbol + SPACE + right;
  }

  public static String indent(String s, int spaces) {
    if (s == null || s.isBlank()) return s;

    String pad = SPACE.repeat(spaces);
    return s.lines()
        .map(line -> pad + line)
        .collect(Collectors.joining("\n"));
  }

  public static String buildAllowedConditionWithOperator(
      List<AttrCondPro> filters,
      RootScope scope
  ) {
    System.out.println("Building allowed condition for filters: " + filters + " with scope: " + scope);
    int lastIndex = filters.size() - 1;
    System.out.println("Last index: " + lastIndex);

    return IntStream.range(0, filters.size())
        .mapToObj(i -> buildSingleAllowedConditionWithOperator(
            filters.get(i),
            scope,
            i == lastIndex
        ))
        .collect(Collectors.joining(AND));
  }

  private static String buildSingleAllowedConditionWithOperator(
      AttrCondPro c,
      RootScope scope,
      boolean isLast
  ) {

    String root;
    if (scope == RootScope.ALL) {
      root = SELF;
    } else if (scope == RootScope.LAST_ONLY && isLast) {
      root = SELF;
    } else {
      root = "e";
    }

    String matchAttr = "";
    matchAttr = buildMatchAttr(c, root);

    // build left hand side path: self.course.credits or e.course.credits
    String left = root + DOT + String.join(DOT, c.attrs);

    // build right hand side path
    String right;

    if ("now()".equals(matchAttr)) {
      // now()
      right = matchAttr;
    } else {
      right = root + DOT + String.join(DOT, c.refs);

      if (!matchAttr.isEmpty()) {
        right = right + DOT + matchAttr;
      }
    }

    // add operator if specified
    if (c.operatorAndValue != null) {
      right = right + SPACE + c.operatorAndValue.getOperator() + SPACE + c.operatorAndValue.getValue();
    }


    String cond;
    switch (c.type) {
      case MIN_LIM, MIN_LIM_ATTR, MIN, MIN_ATTR -> cond = left + GREATER_THAN + right;

      case MAX_LIM, MAX_LIM_ATTR, MAX, MAX_ATTR -> cond = left + LESS_THAN + right;

      case FIX_BOOL -> cond = Boolean.parseBoolean(c.matchAttr.toString())
          ? left
          : "not " + left;

      case MATCH_STR, FIX_ENUM -> cond = left + " = '" + c.matchAttr + "'";

      default -> throw new RuntimeException("Unsupported AttrCondPro type: " + c.type);
    }

    return c.neg ? "not (" + cond + RIGHT_BRACKET : cond;
  }

  private static String buildMatchAttr(AttrCondPro c, String root) {

    // CASE: now()
    if ("now".equalsIgnoreCase(String.valueOf(c.matchAttr))) {
      return "now()";
    }

    if (c.scale != null && !c.scale.isEmpty()) {
      return c.scale + " * " + root + DOT + c.attrs.get(0) + DOT + c.matchAttr;
    }

    if (isNumber(c.matchAttr)) {
      return c.matchAttr.toString();
    }

    return c.matchAttr.toString();
  }


  /**
   * Builds a condition string for excludesSelf condition.
   * e.g: @AttrCond(attr = "previousSemester", excludesSelf = true) with rolePath equals to SELF
   * then the generated OCL will be: previousSemester <> self
   * @param c
   * @return
   */
  private static String buildExcludeSelfCondition(AttrCondPro c) {
    String attrs = buildAttrPath(c.attrs, null);

    return attrs + " <> self";
  }


  /**
   * Builds a relation condition string from the given RelationCond object.
   * E.g: self.course = e.course
   * @param r
   * @return
   */
  public static String buildRelation(RelationCond r) {
    String left = r.leftRoot + DOT + r.leftPath;

    String right = r.rightRoot;
    if (r.rightPath != null && !r.rightPath.isEmpty()) {
      right += DOT + r.rightPath;
    }

    return left + SPACE + r.operator + SPACE + right;
  }



  public static String buildRelationConditions(List<RelationCond> conds) {
    return conds.stream()
        .map(GeneratorUtils::buildRelation)
        .collect(Collectors.joining(AND));
  }













}
