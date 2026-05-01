package org.tzi.use.examplePlugin.metamodel.schedule_constraint.type4;

import org.tzi.use.examplePlugin.metamodel.TimeWindow;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.ScheduleConstraintParser;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.type3.LimitAttribute;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.BASE_TIME;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.DURATION;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.TARGET_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.TIME_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.UNIT;
import static org.tzi.use.examplePlugin.metamodel.CommonAttributes.WINDOW;
import static org.tzi.use.examplePlugin.metamodel.OperatorEnum.OPERATORS;

public class ScheduleConstraintType4Parser implements ScheduleConstraintParser<ScheduleConstraintType4> {

  @Override
  public ScheduleConstraintType4 parse(Map<String, Object> astJson) {
    ScheduleConstraintType4 sc4 = new ScheduleConstraintType4();

    System.out.println("Parsing ScheduleConstraintType4...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>
        ) astJson.get(ARGS);
    sc4.targetAttr = (String) args.get(TARGET_ATTR);
    // parsing limit attribute
    parsingLimit(sc4, args);

    return sc4;
  }

  private void parsingLimit(ScheduleConstraintType4 sc4, Map<String, Object> args) {
    OPERATORS.stream().forEach(operatorEnum -> {
      if (args.containsKey(operatorEnum.name)) {
        LimitAttribute limitAttribute = new LimitAttribute();
        limitAttribute.operator = operatorEnum;
        limitAttribute.value = String.valueOf(args.get(operatorEnum.name));
        sc4.limitAttribute = limitAttribute;
      }
    });
  }
}
