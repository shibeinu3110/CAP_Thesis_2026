package org.tzi.use.useCap.model;

public class CAPSelect implements CAPExpr {
    private CAPExpr source;
    private String var;
    private CAPExpr condition;

    @Override
    public String print() {
      return source.print()
          + "->select(" + var + " | " + condition.print() + ")";
    }
}
