package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.Words;

public class DivisibilityRule implements Rule {

  private boolean applicable = false;

  @Override
  public String getResultByPosition(int position, Words words) {
    String result = String.valueOf(position);
    if (position % words.getFizz() == 0) {
      result = FIZZ;
      applicable = true;
    } else if (position % words.getBuzz() == 0) {
      result = BUZZ;
      applicable = true;
    } else if (position % words.getWhizz() == 0) {
      result = WHIZZ;
      applicable = true;
    }
    return result;
  }

  @Override
  public boolean isApplicable() {
    return applicable;
  }

  @Override
  public void clearApplicable() {
    applicable = false;
  }
}
