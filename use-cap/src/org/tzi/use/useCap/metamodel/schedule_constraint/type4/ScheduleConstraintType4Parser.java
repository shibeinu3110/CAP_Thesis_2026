package org.tzi.use.useCap.metamodel.schedule_constraint.type4;

import org.tzi.use.useCap.metamodel.schedule_constraint.ScheduleConstraintParser;
import org.tzi.use.useCap.metamodel.schedule_constraint.type3.LimitAttribute;

import java.util.Map;

import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.ARGS;
import static org.tzi.use.useCap.metamodel.CommonCAPAttributes.TARGET_ATTR;
import static org.tzi.use.useCap.metamodel.OperatorEnum.OPERATORS;

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
