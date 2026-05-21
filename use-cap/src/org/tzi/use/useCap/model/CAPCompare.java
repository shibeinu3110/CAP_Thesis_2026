package org.tzi.use.useCap.model;

public class CAPCompare implements CAPExpr {
    private CAPExpr left;
    private String operator;
    private CAPExpr right;

    @Override
    public String print() {
        return left.print() + " " + operator + " " + right.print();
    }
}
