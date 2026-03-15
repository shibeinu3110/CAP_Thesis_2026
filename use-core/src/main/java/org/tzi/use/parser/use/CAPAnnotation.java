package org.tzi.use.parser.use;

import org.antlr.runtime.Token;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CAPAnnotation {
  public String name;
  public Map<String, Object> capArgs = new LinkedHashMap<>();
  public String contextClass;
  public Token token;

  public CAPAnnotation(String name) {
    this.name = name;
  }

  public CAPAnnotation(String name, Token token) {
     this.name = name;
     this.token = token;
  }

  public Token getToken() {
    return token;
  }

  public int getLine() {
    return token.getLine();
  }

  public void addArg(String key, Object value) {
    capArgs.put(key, value);
  }

  public String getName() {
    return name;
  }
  public Map<String, Object> getCapArgs() {
    return capArgs;
  }

  @Override
  public String toString() {
    return toStringWithIndent(0);
  }

  private String toStringWithIndent(int indent) {
    String indentStr = "    ".repeat(indent);
    StringBuilder sb = new StringBuilder();

    sb.append(indentStr).append("@").append(name);

    if (capArgs.isEmpty()) return sb.toString();

    sb.append("(\n");

    int count = 0;
    for (Map.Entry<String, Object> e : capArgs.entrySet()) {
      sb.append(indentStr).append("    ")
          .append(e.getKey()).append(" = ")
          .append(formatValue(e.getValue(), indent + 1));

      count++;
      if (count < capArgs.size()) sb.append(",");
      sb.append("\n");
    }

    sb.append(indentStr).append(")");
    return sb.toString();
  }

  private String formatValue(Object v, int indent) {
    String indentStr = "    ".repeat(indent);

    if (v == null) return "null";

    if (v instanceof String) {
      return "'" + v + "'";
    }
    if (v instanceof Integer || v instanceof Double || v instanceof Boolean) {
      return v.toString();
    }
    if (v instanceof CAPAnnotation) {
      return "\n" + ((CAPAnnotation) v).toStringWithIndent(indent);
    }
    if (v instanceof List<?>) {
      StringBuilder sb = new StringBuilder();
      sb.append("{\n");

      List<?> lst = (List<?>) v;
      for (int i = 0; i < lst.size(); i++) {
        sb.append(indentStr)
            .append(formatValue(lst.get(i), indent + 1));
        if (i < lst.size() - 1) sb.append(",");
        sb.append("\n");
      }

      sb.append("    ".repeat(indent - 1)).append("}");
      return sb.toString();
    }
    return v.toString();
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCapArgs(Map<String, Object> capArgs) {
    this.capArgs = capArgs;
  }

  public String getContextClass() {
    return contextClass;
  }

  public void setContextClass(String contextClass) {
    this.contextClass = contextClass;
  }
}