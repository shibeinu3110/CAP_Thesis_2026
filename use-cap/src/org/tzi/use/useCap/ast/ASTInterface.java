package org.tzi.use.useCap.ast;

import java.util.LinkedHashMap;
import java.util.Map;

public class ASTInterface {
  public String name;
  public Map<String, Object> args = new LinkedHashMap<>();
  public String contextClass;


  public void setName(String name) {
    this.name = name;
  }

  public void setArgs(Map<String, Object> args) {
    this.args = args;
  }

  public void setContextClass(String contextClass) {
    this.contextClass = contextClass;
  }
}
