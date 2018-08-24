package com.github.mgljava.strategy;

import com.github.mgljava.entity.Words;
import java.util.List;

public class RuleEngine {

  private Words words;
  private List<Rule> rules;

  public RuleEngine(Words words, List<Rule> rules) {
    this.words = words;
    this.rules = rules;
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
