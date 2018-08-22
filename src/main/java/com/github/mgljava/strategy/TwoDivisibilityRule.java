package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.Words;

public class TwoDivisibilityRule implements Rule {

  private boolean applicable = false;

  @Override
  public String get(int position, Words words) {
    String result = String.valueOf(position);
    if (position % words.getFizz() == 0 &&
        position % words.getBuzz() == 0 &&
        position % words.getWhizz() == 0) {
      result = FIZZ_BUZZ_WHIZZ;
      applicable = true;
    } else if (position % words.getFizz() == 0 &&
        position % words.getBuzz() == 0) {
      result = FIZZ_BUZZ;
      applicable = true;
    } else if (position % words.getFizz() == 0 &&
        position % words.getWhizz() == 0) {
      result = FIZZ_WHIZZ;
      applicable = true;
    }
    if (position % words.getBuzz() == 0 && position % words.getWhizz() == 0) {
      System.out.println(BUZZ_WHIZZ);
      applicable = true;
    }
    return result;
  }

  @Override
  public boolean isApplicable() {
    return applicable;
  }
}
