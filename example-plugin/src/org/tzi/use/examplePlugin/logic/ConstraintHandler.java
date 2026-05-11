package org.tzi.use.examplePlugin.logic;

import org.tzi.use.examplePlugin.ast.ASTInterface;

import java.util.Map;

public interface ConstraintHandler {
  String detect(ASTInterface ast);
  String execute(ASTInterface ast, Map<String, Object> json, String context, String name);
}
