package org.tzi.use.useCap.logic;

import org.tzi.use.useCap.ast.ASTInterface;

import java.util.Map;

public interface ConstraintHandler {
  String detect(ASTInterface ast);
  String execute(ASTInterface ast, Map<String, Object> json, String context, String name);
}
