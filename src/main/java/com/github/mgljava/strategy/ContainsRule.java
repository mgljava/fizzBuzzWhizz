package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.Words;

public class ContainsRule implements Rule {

  private boolean applicable = false;

  @Override
  public String getResultByPosition(int position, Words words) {
    String result = String.valueOf(position);
    if (String.valueOf(position).contains(String.valueOf(words.getFizz()))) {
      applicable = true;
      result = FIZZ;
    } else if (String.valueOf(position).contains(String.valueOf(words.getBuzz()))) {
      applicable = true;
      result = BUZZ;
    } else if (String.valueOf(position).contains(String.valueOf(words.getWhizz()))) {
      applicable = true;
      result = WHIZZ;
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
