package org.tzi.use.useCap;

public enum CaculatorEnum {
  PLUS("plus", "+"),
  MINUS("minus", "-"),
  MULTIPLY("multiply", "*"),
  DIVIDE("divide", "/");

  public final String name;
  public final String symbol;

  CaculatorEnum(String name, String symbol) {
    this.name = name;
    this.symbol = symbol;
  }
}
