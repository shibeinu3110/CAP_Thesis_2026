package org.tzi.use.examplePlugin.util;

import java.util.List;

public class CommonAttributes {

    public static final String COLLECT = "collect";
    public static final String FIX_ATTR = "fixAttr";
    public static final List<String> BOUND_CONDITIONS = List.of(
        "max", "min",
        "maxAttr", "minAttr",
        "maxLim", "minLim",
        "maxLimAttr", "minLimAttr");
}
