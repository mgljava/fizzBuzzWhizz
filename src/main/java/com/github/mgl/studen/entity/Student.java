package com.github.mgl.studen.entity;

import com.github.mgljava.strategy.CountOffRule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

  private GameNumber gameNumber;

  public boolean numberOff(CountOffRule countOffRule, int currentNumber) {
    return countOffRule.matchers(currentNumber, gameNumber);
  }
}
