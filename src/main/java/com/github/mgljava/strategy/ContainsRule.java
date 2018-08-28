package com.github.mgljava.strategy;

import com.github.mgljava.entity.Word;

public class ContainsRule implements Rule {

  private boolean applicable = false;

  @Override
  public String getResultByPosition(int position, Word word) {
    applicable = false;
    String result = String.valueOf(position);
    if (isContains(position, word.getFizz())) {
      applicable = true;
      result = FIZZ;
    } else if (isContains(position, word.getBuzz())) {
      applicable = true;
      result = BUZZ;
    } else if (isContains(position, word.getWhizz())) {
      applicable = true;
      result = WHIZZ;
    }
    return result;
  }

  private boolean isContains(int position, Integer fizz) {
    return String.valueOf(position).contains(String.valueOf(fizz));
  }

  @Override
  public boolean isApplicable() {
    return applicable;
  }
}
