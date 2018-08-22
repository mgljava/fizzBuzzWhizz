package com.github.mgl.studen.entity;

import com.github.mgljava.strategy.RuleEngine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

  private RuleEngine ruleEngine;
  private Integer position;

  public String count() {
    return ruleEngine.get(position);
  }
}
