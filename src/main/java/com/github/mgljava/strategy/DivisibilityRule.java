package com.github.mgljava.strategy;

import com.github.mgljava.entity.Word;

public class DivisibilityRule implements Rule {

  private boolean applicable = false;

  @Override
  public String getResultByPosition(int position, Word word) {
    applicable = false;
    String result = String.valueOf(position);
    if (isaDivisibility(position, word.getFizz())) {
      result = FIZZ;
      applicable = true;
    } else if (isaDivisibility(position, word.getBuzz())) {
      result = BUZZ;
      applicable = true;
    } else if (isaDivisibility(position, word.getWhizz())) {
      result = WHIZZ;
      applicable = true;
    }
    return result;
  }

  private boolean isaDivisibility(int position, Integer fizz) {
    return position % fizz == 0;
  }

  @Override
  public boolean isApplicable() {
    return applicable;
  }
}
