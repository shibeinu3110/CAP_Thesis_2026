package org.tzi.use.useCap.metamodel;

public class Cacu {
  // for first multiple attr, do not use `rolePath` attribute, just iterator
  // e.g: collect( e | e.attr...)
  public String attr;

  // for second single attr, use `rolePath` attribute to specify the path to the attr
  // e.g: e.rolePath.attr2 with rolePath = "rolePath" and attr2 = "attr2"
  public String attr2;
}
