package org.tzi.use.useCap.model.sum;

import org.tzi.use.useCap.model.CAPExpr;

public class CAPSum implements CAPExpr {
  private CAPExpr source;
  @Override
  public String print() {
    return source.print() + "->sum()";
  }
}
