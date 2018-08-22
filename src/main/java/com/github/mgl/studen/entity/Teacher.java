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

  private Words words;

  public Words say(int fizz, int buzz, int whizz) {
    return new Words(fizz, buzz, whizz);
  }
}
