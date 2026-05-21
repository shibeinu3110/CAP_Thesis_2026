package org.tzi.use.useCap.metamodel;


public class RelationCond {
  public String leftRoot;
  public String leftPath;

  public String operator;

  public String rightRoot;
  public String rightPath;

  public RelationCond(String leftRoot, String leftPath,
                      String operator,
                      String rightRoot, String rightPath) {
    this.leftRoot = leftRoot;
    this.leftPath = leftPath;
    this.operator = operator;
    this.rightRoot = rightRoot;
    this.rightPath = rightPath;
  }
}
