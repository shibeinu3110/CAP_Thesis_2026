package org.tzi.use.examplePlugin.metamodel.time_constraint.type5;

import org.tzi.use.examplePlugin.metamodel.time_constraint.TimeConstraintParser;
import org.tzi.use.examplePlugin.util.ParserUtil;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.MAX;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.SUM_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.TARGET_ASSOC;
import static org.tzi.use.examplePlugin.util.UseUtils.asString;

public class TimeConstraintType5Parser implements TimeConstraintParser<TimeConstraintType5> {

  @Override
  public TimeConstraintType5 parse(Map<String, Object> astJson) {
    TimeConstraintType5 tc5 = new TimeConstraintType5();

    System.out.println("Parsing TimeConstraintType5...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>) astJson.get(ARGS);
    tc5.targetAssoc = (String) args.get(TARGET_ASSOC);

    // if parts
    tc5.ifParts = ParserUtil.parseIfPart(astJson);
    System.out.println("Parsed ifParts: " + tc5.ifParts);

    // check for existence parts
    tc5.sumAttr = asString(args.get(SUM_ATTR));
    tc5.max = Integer.parseInt(asString(args.get(MAX)));

    if (!tc5.sumAttr.equals("1") || tc5.max != 0) {
      throw new IllegalArgumentException("TimeConstraintType5 requires sumAttr to be '1' and max to be 0");
    }

    return tc5;
  }
}
