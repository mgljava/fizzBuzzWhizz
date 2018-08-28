package com.github.mgljava.strategy;

import com.github.mgljava.entity.Word;
import java.util.List;

public class RuleEngine {

  private Word word;
  private List<Rule> rules;

  public RuleEngine(Word word, List<Rule> rules) {
    this.word = word;
    this.rules = rules;
  }

  public String getResult(Integer position) {
    for (Rule rule : rules) {
      String result = rule.getResultByPosition(position, word);
      if (rule.isApplicable()) {
        return result;
      }
    }
    return String.valueOf(position);
  }
}
