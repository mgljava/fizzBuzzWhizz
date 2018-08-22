package com.github.mgljava.strategy;


import com.github.mgl.studen.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TwoDivisibilityRule implements CountOffRule {

  private Teacher teacher;

  @Override
  public boolean sayResultByNumber(int currentNumber) {
    boolean flag = false;

    if (currentNumber % teacher.getFizz() == 0 &&
        currentNumber % teacher.getBuzz() == 0 &&
        currentNumber % teacher.getWhizz() == 0) {
      System.out.println(FIZZ_BUZZ_WHIZZ);
      flag = true;
    }

    if (currentNumber % teacher.getFizz() == 0 && currentNumber % teacher.getBuzz() == 0) {
      System.out.println(FIZZ_BUZZ);
      flag = true;
    }
    if (currentNumber % teacher.getFizz() == 0 && currentNumber % teacher.getWhizz() == 0) {
      System.out.println(FIZZ_WHIZZ);
      flag = true;
    }
    if (currentNumber % teacher.getBuzz() == 0 && currentNumber % teacher.getWhizz() == 0) {
      System.out.println(BUZZ_WHIZZ);
      flag = true;
    }
    return flag;
  }
}
