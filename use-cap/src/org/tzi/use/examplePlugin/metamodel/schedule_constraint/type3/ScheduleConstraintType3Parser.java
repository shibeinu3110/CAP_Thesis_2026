package org.tzi.use.examplePlugin.metamodel.schedule_constraint.type3;

import org.tzi.use.examplePlugin.metamodel.TimeWindow;
import org.tzi.use.examplePlugin.metamodel.schedule_constraint.ScheduleConstraintParser;

import java.util.Map;

import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ASSOC_CLS;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.BASE_TIME;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.DURATION;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.ROLE_PATH;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.TIME_ATTR;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.UNIT;
import static org.tzi.use.examplePlugin.metamodel.CommonCAPAttributes.WINDOW;
import static org.tzi.use.examplePlugin.metamodel.OperatorEnum.OPERATORS;

public class ScheduleConstraintType3Parser implements ScheduleConstraintParser<ScheduleConstraintType3> {

  @Override
  public ScheduleConstraintType3 parse(Map<String, Object> astJson) {
    ScheduleConstraintType3 sc3 = new ScheduleConstraintType3();

    System.out.println("Parsing ScheduleConstraintType3...");

    // ---- root args ----
    Map<String, Object> args = (Map<String, Object>
        ) astJson.get(ARGS);
    sc3.assocCls = (String) args.get(ASSOC_CLS);
    sc3.rolePath = (String) args.get(ROLE_PATH);

    Map<String, Object> windowNode =
        (Map<String, Object>) args.get(WINDOW);

    Map<String, Object> windowArgs =
        (Map<String, Object>) windowNode.get(ARGS);

    sc3.window = new TimeWindow();
    sc3.window.timeAttr = String.valueOf(windowArgs.get(TIME_ATTR));
    sc3.window.baseTime = String.valueOf(windowArgs.get(BASE_TIME));
    sc3.window.duration = Integer.parseInt(
        windowArgs.get(DURATION).toString()
    );
    sc3.window.unit = String.valueOf(windowArgs.get(UNIT));

    if (sc3.window.baseTime == null || sc3.window.unit == null || sc3.window.timeAttr == null) {
      throw new IllegalArgumentException("TimeWindow is missing required attributes.");
    }

    // parsing limit attribute
    parsingLimit(sc3, args);

    return sc3;
  }

  private void parsingLimit(ScheduleConstraintType3 sc3, Map<String, Object> args) {
    OPERATORS.stream().forEach(operatorEnum -> {
      if (args.containsKey(operatorEnum.name)) {
        LimitAttribute limitAttribute = new LimitAttribute();
        limitAttribute.operator = operatorEnum;
        limitAttribute.value = String.valueOf(args.get(operatorEnum.name));
        sc3.limitAttribute = limitAttribute;
      }
    });
  }
}
