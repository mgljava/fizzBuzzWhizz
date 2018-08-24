package com.github.mgljava.strategy;

import com.github.mgljava.entity.Words;
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

  public String getResult(Integer position) {
    for (Rule rule : rules) {
      String result = rule.getResultByPosition(position, words);
      if (rule.isApplicable()) {
        rule.clearApplicable();
        return result;
      }
    }
    return String.valueOf(position);
  }
}
