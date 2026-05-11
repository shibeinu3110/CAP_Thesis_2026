package org.tzi.use.examplePlugin.util;

import org.tzi.use.examplePlugin.CaculatorEnum;
import org.tzi.use.examplePlugin.metamodel.AttrCondPro;
import org.tzi.use.examplePlugin.metamodel.Cacu;
import org.tzi.use.examplePlugin.metamodel.IfPart;
import org.tzi.use.examplePlugin.metamodel.OperatorValue;
import org.tzi.use.examplePlugin.metamodel.RelationCond;
import org.tzi.use.examplePlugin.util.enumarate.IfFixType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.*;
import static org.tzi.use.examplePlugin.util.CommonComparationsAttributes.*;
import static org.tzi.use.examplePlugin.util.CommonComparationsAttributes.FIX_ATTR;
import static org.tzi.use.examplePlugin.util.CommonComparationsAttributes.MATCH_ATTR;
import static org.tzi.use.examplePlugin.util.CommonComparationsAttributes.MAX;
import static org.tzi.use.examplePlugin.util.CommonComparationsAttributes.MIN;
import static org.tzi.use.examplePlugin.util.UseUtils.asString;
import static org.tzi.use.examplePlugin.util.constant.GeneratorConstant.DOT;


public class ParserUtil {
  public static List<IfPart> parseIfPart(Map<String, Object> astJson) {

    List<IfPart> result = new ArrayList<>();

    Map<String, Object> args =
        (Map<String, Object>) astJson.get(ARGS);

    System.out.println();

    if (args == null || !args.containsKey(IF_PART)) {
      System.out.println("No ifPart found in AST JSON.");
      return List.of();
    }

    System.out.println("Parsing ifPart from args: " + args);

    List<Map<String, Object>> ifParts =
        (List<Map<String, Object>>) args.get(IF_PART);

    System.out.println("Found ifParts: " + ifParts);

    for (Map<String, Object> cond : ifParts) {

      Map<String, Object> condArgs =
          (Map<String, Object>) cond.get(ARGS);

      IfPart ip = new IfPart();

      // attrs
      List<String> attrs = condArgs.entrySet().stream()
          .filter(e -> e.getKey().startsWith(ATTR))
          .sorted(Map.Entry.comparingByKey())
          .map(e -> asString(e.getValue()))
          .toList();

      if (!attrs.isEmpty()) {
        ip.ifAttr = String.join(".", attrs);
      }

      // refs
      List<String> refs = condArgs.entrySet().stream()
          .filter(e -> e.getKey().startsWith(REF))
          .sorted(Map.Entry.comparingByKey())
          .map(e -> asString(e.getValue()))
          .toList();

      if (!refs.isEmpty()) {
        ip.refs = String.join(DOT, refs);
      }

      if (condArgs.containsKey(FIX_ATTR) || condArgs.containsKey(MATCH_ATTR)) {
        ip.ifFixType = IfFixType.FIX_ATTR;
        ip.ifFixValue = asString(condArgs.get(FIX_ATTR) != null ? condArgs.get(FIX_ATTR) : condArgs.get(MATCH_ATTR));
      } else if (condArgs.containsKey(FIX_NUM)) {
        ip.ifFixType = IfFixType.FIX_NUM;
        ip.ifFixValue = asString(condArgs.get(FIX_NUM));
      } else if (condArgs.containsKey(FIX_BOOL)) {
        ip.ifFixType = IfFixType.FIX_BOOL;
        ip.ifFixValue = asString(condArgs.get(FIX_BOOL));
      } else if (condArgs.containsKey(FIX_STR)) {
        ip.ifFixType = IfFixType.FIX_STR;
        ip.ifFixValue = asString(condArgs.get(FIX_STR));
      } else if (condArgs.containsKey(FIX_ENUM)) {
        ip.ifFixType = IfFixType.FIX_ENUM;
        ip.ifFixValue = asString(condArgs.get(FIX_ENUM));
      } else if (condArgs.containsKey(MAX_LIM)) {
        ip.ifFixType = IfFixType.MAX_VALUE;
        ip.ifFixValue = asString(condArgs.get(MAX_LIM));
      } else if (condArgs.containsKey(MIN_LIM)) {
        ip.ifFixType = IfFixType.MIN_VALUE;
        ip.ifFixValue = asString(condArgs.get(MIN_LIM));
      } else if (condArgs.containsKey(MAX_VALUE)) {
        ip.ifFixType = IfFixType.MAX_LIM;
        ip.ifFixValue = asString(condArgs.get(MAX_VALUE));
      } else if (condArgs.containsKey(MIN_VALUE)) {
        ip.ifFixType = IfFixType.MIN_LIM;
        ip.ifFixValue = asString(condArgs.get(MIN_VALUE));
      } else if (condArgs.containsKey(MAX_LIM_ATTR)) {
        ip.ifFixType = IfFixType.MAX_LIM_ATTR;
        ip.ifFixValue = asString(condArgs.get(MAX_LIM_ATTR));
      } else if (condArgs.containsKey(MIN_LIM_ATTR)) {
        ip.ifFixType = IfFixType.MIN_LIM_ATTR;
        ip.ifFixValue = asString(condArgs.get(MIN_LIM_ATTR));
      } else if (condArgs.containsKey(MIN)) {
        ip.ifFixType = IfFixType.MIN;
        ip.ifFixValue = asString(condArgs.get(MIN));
      } else if (condArgs.containsKey(MAX)) {
        ip.ifFixType = IfFixType.MAX;
        ip.ifFixValue = asString(condArgs.get(MAX));
      }

      // parsing plus=21 or minus=45 or times=42 or div=47...
      Arrays.stream(CaculatorEnum.values())
          .filter(e -> condArgs.containsKey(e.name))
          .findFirst()
          .ifPresent(e ->
              ip.operatorAndValue =
                  new OperatorValue(e.symbol, condArgs.get(e.name))
          );

      // negated
      if (condArgs.containsKey("negated")) {
        ip.negated = Boolean.TRUE.equals(condArgs.get("negated"));
      }

      // calSize
      ip.calSize = false;

      if (condArgs.containsKey("calSize")) {
        Object v = condArgs.get("calSize");
        ip.calSize = Boolean.parseBoolean(String.valueOf(v));
      }

      result.add(ip);
    }

    return result;
  }

  /**
   * Parse attributes from condition arguments. It looks for keys like ATTR, "attr2", "attr3", etc. and collects their values in order.
   * @param condArgs
   * @return
   */
  public static List<String> parseAttrsFromCondArgs(Map<String, Object> condArgs) {
    System.out.println("Parsing attrs from condArgs: " + condArgs);
    List<String> attrs = new ArrayList<>();

    if (condArgs.containsKey(ATTR)) {
      attrs.add(asString(condArgs.get(ATTR)));
    }

    int i = 2;
    while (condArgs.containsKey(ATTR + i)) {
      attrs.add(asString(condArgs.get(ATTR + i)));
      i++;
    }

    return attrs;
  }

  /**
   * Parse references from condition arguments. It looks for keys like REF, "ref2", "ref3", etc. and collects their values in order.
   * @param condArgs
   * @return
   */
  public static List<String> parseRefsFromCondArgs(Map<String, Object> condArgs) {
    System.out.println("Parsing refs from condArgs: " + condArgs);
    List<String> refs = new ArrayList<>();

    if (condArgs.containsKey(REF)) {
      refs.add(asString(condArgs.get(REF)));
    }

    int i = 2;
    while (condArgs.containsKey(REF + i)) {
      refs.add(asString(condArgs.get(REF + i)));
      i++;
    }

    return refs;
  }

  /**
   * Parse checkForExi conditions from the given arguments. It looks for a list of conditions under the specified key (defaulting to CHECK_FOR_EXI) and converts each condition into an AttrCondPro object.
   * @param args
   * @param key by default, it looks for CHECK_FOR_EXI, but it can be customized to look for other keys that have the same structure.
   * @return
   */
  public static List<AttrCondPro> parseCheckForExi(
      Map<String, Object> args, String key
  ) {

    for (Map.Entry<String, Object> entry : args.entrySet()) {
      System.out.println("Checking key in args: " + entry.getKey());
    }

    List<Map<String, Object>> checkForExi =
        (List<Map<String, Object>>) args.get(key == null ? CHECK_FOR_EXI : key);

    if (checkForExi == null || checkForExi.isEmpty()) return null;

    List<AttrCondPro> attrConds = new ArrayList<>();

    for (Map<String, Object> attrCond : checkForExi) {

      Map<String, Object> condArgs =
          (Map<String, Object>) attrCond.get(ARGS);

      System.out.println("Parsing collect condition: " + condArgs);

      AttrCondPro c = new AttrCondPro();
      c.attrs = ParserUtil.parseAttrsFromCondArgs(condArgs);
      c.refs = ParserUtil.parseRefsFromCondArgs(condArgs);
      c.neg = Boolean.TRUE.equals(condArgs.get("neg"));
      c.insideExistValue = asString(condArgs.get(ATTR_EXISTS));
      c.excludesSelf = Boolean.parseBoolean(
          String.valueOf(condArgs.get(EXCLUDE_SELF))
      );
      c.isUndefined  = Boolean.parseBoolean(
          String.valueOf(condArgs.get(IS_UNDEFINED))
      );
      c.refAttr = asString(condArgs.get(REF_ATTR));

      // scale or ratio
      Object scale = condArgs.get(SCALE);
      Object ratio = condArgs.get(RATIO);

      c.scale = scale != null
          ? scale.toString()
          : (ratio != null ? ratio.toString() : null);

      // parsing plus=21 or minus=45 or times=42 or div=47...
      System.out.println("Looking for calculator operator in condArgs: " + condArgs);
      Arrays.stream(CaculatorEnum.values())
          .filter(e -> condArgs.containsKey(e.name))
          .findFirst()
          .ifPresent(e ->
              c.operatorAndValue =
                  new OperatorValue(e.symbol, condArgs.get(e.name))
          );

      if (condArgs.containsKey(MIN_LIM)) {
        c.type = AttrCondPro.Type.MIN_LIM;
        c.matchAttr = String.valueOf(condArgs.get(MIN_LIM));
      } else if (condArgs.containsKey(MAX_LIM)) {
        c.type = AttrCondPro.Type.MAX_LIM;
        c.matchAttr = String.valueOf(condArgs.get(MAX_LIM));
      } else if (condArgs.containsKey(FIX_BOOL)) {
        c.type = AttrCondPro.Type.FIX_BOOL;
        c.matchAttr = String.valueOf(condArgs.get(FIX_BOOL));
      } else if (condArgs.containsKey(FIX_NUM)) {
        c.type = AttrCondPro.Type.FIX_NUM;
        c.matchAttr = String.valueOf(condArgs.get(FIX_NUM));
      } else if (condArgs.containsKey(MIN_LIM_ATTR)) {
        c.type = AttrCondPro.Type.MIN_LIM_ATTR;
        c.matchAttr = String.valueOf(condArgs.get(MIN_LIM_ATTR));
      } else if (condArgs.containsKey(MAX_LIM_ATTR)) {
        c.type = AttrCondPro.Type.MAX_LIM_ATTR;
        c.matchAttr = String.valueOf(condArgs.get(MAX_LIM_ATTR));
      } else if (condArgs.containsKey(MIN)) {
        c.type = AttrCondPro.Type.MIN;
        c.matchAttr = String.valueOf(condArgs.get(MIN));
      } else if (condArgs.containsKey(MAX)) {
        c.type = AttrCondPro.Type.MAX;
        c.matchAttr = String.valueOf(condArgs.get(MAX));
      } else if (condArgs.containsKey(MAX_ATTR)) {
        c.type = AttrCondPro.Type.MAX_ATTR;
        c.matchAttr = String.valueOf(condArgs.get(MAX_ATTR));
      } else if (condArgs.containsKey(MIN_ATTR)) {
        c.type = AttrCondPro.Type.MIN_ATTR;
        c.matchAttr = String.valueOf(condArgs.get(MIN_ATTR));
      } else if (condArgs.containsKey(FIX_STR)) {
        c.type = AttrCondPro.Type.FIX_STR;
        c.matchAttr = String.valueOf(condArgs.get(FIX_STR));
      } else if (condArgs.containsKey(MATCH_ATTR)) {
        c.type = AttrCondPro.Type.MATCH_ATTR;
        c.matchAttr = String.valueOf(condArgs.get(MATCH_ATTR));
      } else if (condArgs.containsKey(MATCH_OBJECT)) {
        c.type = AttrCondPro.Type.MATCH_OBJECT;
        c.matchAttr = String.valueOf(condArgs.get(MATCH_OBJECT));
      }

      attrConds.add(c);
    }

    return attrConds;
  }

  public static Number parseNumber(Object scale) {
    if (scale instanceof Number) {
      return (Number) scale;
    } else if (scale instanceof String) {
      try {
        if (((String) scale).contains(".")) {
          return Double.parseDouble((String) scale);
        } else {
          return Integer.parseInt((String) scale);
        }
      } catch (NumberFormatException e) {
        System.err.println("Failed to parse number from string: " + scale);
        return null;
      }
    } else {
      System.err.println("Unsupported type for scale: " + scale.getClass());
      return null;
    }
  }


  /**
   * Parse relation conditions from the given arguments. It looks for a list of relations under the "relations" key and converts each relation into a RelationCond object.
   * @param args
   * @return
   */
  public static List<RelationCond> parseRelationConds(Map<String, Object> args) {

    List<Map<String, Object>> rels =
        (List<Map<String, Object>>) args.get(RELATIONS);

    if (rels == null || rels.isEmpty()) return List.of();

    List<RelationCond> result = new ArrayList<>();

    for (Map<String, Object> rel : rels) {

      Map<String, Object> condArgs =
          (Map<String, Object>) rel.get(ARGS);

      String left = asString(condArgs.get(LEFT));
      String op   = asString(condArgs.get(OP));
      String right= asString(condArgs.get(RIGHT));

      // split left
      String[] leftParts = left.split("\\.", 2);
      String leftRoot = leftParts[0];
      String leftPath = leftParts.length > 1 ? leftParts[1] : "";

      // split right
      String[] rightParts = right.split("\\.", 2);
      String rightRoot = rightParts[0];
      String rightPath = rightParts.length > 1 ? rightParts[1] : "";

      result.add(new RelationCond(
          leftRoot,
          leftPath,
          op,
          rightRoot,
          rightPath
      ));
    }

    return result;
  }

  public static Cacu parseCacu(Map<String, Object> args, String attrKey) {
    if (args == null || !args.containsKey(attrKey)) {
      return null;
    }

    Map<String, Object> cacuPart = (Map<String, Object>) args.get(attrKey);

    Map<String, Object> innerArgs = (Map<String, Object>) cacuPart.get(ARGS);

    Cacu c = new Cacu();
    c.attr  = (String) innerArgs.get(ATTR);
    c.attr2 = (String) innerArgs.get(ATTR2);

    return c;
  }


}
