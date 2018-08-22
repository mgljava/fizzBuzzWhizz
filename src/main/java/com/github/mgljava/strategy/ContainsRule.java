package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContainsRule implements CountOffRule {

  private Teacher teacher;

  @Override
  public boolean sayResultByNumber(int currentNumber) {
    boolean flag = false;

    if (String.valueOf(currentNumber).contains(String.valueOf(teacher.getFizz()))) {
      System.out.println(FIZZ);
      flag = true;
    }
    if (String.valueOf(currentNumber).contains(String.valueOf(teacher.getBuzz()))) {
      System.out.println(BUZZ);
      flag = true;
    }
    if (String.valueOf(currentNumber).contains(String.valueOf(teacher.getWhizz()))) {
      System.out.println(WHIZZ);
      flag = true;
    }
    return flag;
  }
}
