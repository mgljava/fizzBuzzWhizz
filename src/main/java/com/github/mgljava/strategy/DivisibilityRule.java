package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.GameNumber;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DivisibilityRule implements CountOffRule {

  @Override
  public boolean matchers(int currentNumber, GameNumber gameNumber) {
    boolean flag = false;
    if (currentNumber % gameNumber.getFizz() == 0) {
      System.out.println(FIZZ);
      flag = true;
    }

    if (currentNumber % gameNumber.getBuzz() == 0) {
      System.out.println(BUZZ);
      flag = true;
    }

    if (currentNumber % gameNumber.getWhizz() == 0) {
      System.out.println(WHIZZ);
      flag = true;
    }
    return flag;
  }
}
