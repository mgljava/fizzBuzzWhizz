package com.github.mgl.studen.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

  private Integer fizz;
  private Integer buzz;
  private Integer whizz;

  public Teacher sayThreeNumber(int fizz, int buzz, int whizz) {
    return new Teacher(fizz, buzz, whizz);
  }
}
