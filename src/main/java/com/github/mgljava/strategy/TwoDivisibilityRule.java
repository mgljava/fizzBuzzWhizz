package com.github.mgljava.strategy;

import com.github.mgljava.entity.Word;

public class TwoDivisibilityRule implements Rule {

  private boolean applicable = false;

  @Override
  public String getResultByPosition(int position, Word word) {
    applicable = false;
    String result = String.valueOf(position);
    if (isaBoolean(position, word.getFizz(), word.getBuzz()) &&
        position % word.getWhizz() == 0) {
      result = FIZZ_BUZZ_WHIZZ;
      applicable = true;
    } else if (isaBoolean(position, word.getFizz(), word.getBuzz())) {
      result = FIZZ_BUZZ;
      applicable = true;
    } else if (isaBoolean(position, word.getFizz(), word.getWhizz())) {
      result = FIZZ_WHIZZ;
      applicable = true;
    } else if (isaBoolean(position, word.getBuzz(), word.getWhizz())) {
      result = BUZZ_WHIZZ;
      applicable = true;
    }
    return result;
  }

  private boolean isaBoolean(int position, Integer fizz, Integer buzz) {
    return position % fizz == 0 && position % buzz == 0;
  }

  @Override
  public boolean isApplicable() {
    return applicable;
  }
}
