package org.tzi.use.examplePlugin.metamodel;

/**
 * A class to hold all the common attributes for CAPs, including eligibility constraint, schedule constraint, size constraint, status constraint, retake constraint, structural constraint, prerequisite constraint, sum/product constraint.
 */

public class CommonCAPAttributes {
  // Joining attributes
  public static final String AND = "and";
  public static final String OR = "or";

  public static final String ARGS = "args";
  public static final String ASSOC_CLS = "assocCls";
  public static final String ROLE_PATH = "rolePath";
  public static final String SUM_ATTR = "sumAttr";
  public static final String FIX_ATTR = "fixAttr";
  public static final String COLLECT = "collect";
  public static final String IF_PART = "ifPart";
  public static final String ATTR = "attr";
  public static final String ATTR2 = "attr2";
  public static final String MATCH_ATTR = "matchAttr";
  public static final String MAX = "max";
  public static final String MIN = "min";
  public static final String REF = "ref";

  // eligibility constraint specific
  public static final String CHECK_FOR_EXI = "checkForExi";
  public static final String SCALE = "scale";
  public static final String RATIO = "ratio";
  public static final String TARGET_ASSOC = "targetAssoc";
  public static final String MATCH_COLL = "matchColl";

  // schedule constraint specific
  public static final String CROSS_REFERENCE = "crossReference";
  public static final String CONFLICT_CHECK = "conflictCheck";
  public static final String INTERSECTION_OP = "intersectionOp";
  public static final String ALT_PART = "altPart";
  public static final String WINDOW = "window";
  public static final String TIME_ATTR = "timeAttr";
  public static final String BASE_TIME = "baseTime";
  public static final String DURATION = "duration";
  public static final String UNIT = "unit";
  public static final String TARGET_ATTR = "targetAttr";

  // size constraint specific
  public static final String TARGET_COLLECTION = "targetCollection";

  // status constraint specific
  public static final String CHECK_STATUS = "checkStatus";

  // retake constraint specific
  public static final String ATTR_EXISTS = "attrExists";
  public static final String CHECK_FOR_EXI2 = "checkForExi2";

  // structural constraint specific
  public static final String CHECK_STRUCTURE = "checkStructure";
  public static final String EXCLUDE_SELF = "excludesSelf";
  public static final String IS_UNDEFINED = "isUndefined";

  // prerequisite constraint specific
  public static final String CHECKED_ROLE = "checkedRole";
  public static final String REQUIRES = "requires";
  public static final String REF_ATTR = "refAttr";
  public static final String NO_SELF = "noSelf";
  public static final String MAX_DEPTH_LIMIT = "maxDepthLimit";
  public static final String RELATIONS = "relations";
  public static final String REQUIRE_EXIST = "requireExists";
  public static final String CHECK_EXEC = "checkExec";

  // sum/product constraint specific
  public static final String DERIVE = "derive";
  public static final String RESULT = "result";
  public static final String FILTERS = "filters";
  public static final String SUM_ATTR1 = "sumAttr1";
  public static final String SUM_ATTR2 = "sumAttr2";
  public static final String CACU = "cacu";
}
