package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.GameNumber;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ContainsRule implements CountOffRule {

  @Override
  public boolean matchers(int currentNumber, GameNumber gameNumber) {
    boolean flag = false;

    if (String.valueOf(currentNumber).contains(String.valueOf(gameNumber.getFizz()))) {
      System.out.println(FIZZ);
      flag = true;
    }
    if (String.valueOf(currentNumber).contains(String.valueOf(gameNumber.getBuzz()))) {
      System.out.println(BUZZ);
      flag = true;
    }
    if (String.valueOf(currentNumber).contains(String.valueOf(gameNumber.getWhizz()))) {
      System.out.println(WHIZZ);
      flag = true;
    }
    return flag;
  }
}
