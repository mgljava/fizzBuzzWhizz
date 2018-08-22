package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DivisibilityRule implements CountOffRule {

  private Teacher teacher;

  @Override
  public boolean sayResultByNumber(int currentNumber) {
    boolean flag = false;
    if (currentNumber % teacher.getFizz() == 0) {
      System.out.println(FIZZ);
      flag = true;
    }

    if (currentNumber % teacher.getBuzz() == 0) {
      System.out.println(BUZZ);
      flag = true;
    }

    if (currentNumber % teacher.getWhizz() == 0) {
      System.out.println(WHIZZ);
      flag = true;
    }
    return flag;
  }
}
