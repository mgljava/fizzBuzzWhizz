package com.github.mgljava.strategy;


import com.github.mgl.studen.entity.GameNumber;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwoDivisibilityRule implements CountOffRule {

  @Override
  public boolean matchers(int currentNumber, GameNumber gameNumber) {
    boolean flag = false;

    if (currentNumber % gameNumber.getFizz() == 0 &&
        currentNumber % gameNumber.getBuzz() == 0 &&
        currentNumber % gameNumber.getWhizz() == 0) {
      System.out.println(FIZZ_BUZZ_WHIZZ);
      flag = true;
    }

    if (currentNumber % gameNumber.getFizz() == 0 && currentNumber % gameNumber.getBuzz() == 0) {
      System.out.println(FIZZ_BUZZ);
      flag = true;
    }
    if (currentNumber % gameNumber.getFizz() == 0 && currentNumber % gameNumber.getWhizz() == 0) {
      System.out.println(FIZZ_WHIZZ);
      flag = true;
    }
    if (currentNumber % gameNumber.getBuzz() == 0 && currentNumber % gameNumber.getWhizz() == 0) {
      System.out.println(BUZZ_WHIZZ);
      flag = true;
    }
    return flag;
  }
}
