package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.Words;
import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

  private Words words;
  private final List<Rule> rules = new ArrayList<>();


  public RuleEngine(Words words) {
    this.words = words;
    rules.add(new ContainsRule());
    rules.add(new TwoDivisibilityRule());
    rules.add(new DivisibilityRule());
  }

  public String get(Integer position) {
    for (Rule rule : rules) {
      String result = rule.get(position, words);
      if (rule.isApplicable()) {
        rule.clearApplicable();
        return result;
      }
    }
    return String.valueOf(position);
  }
}
