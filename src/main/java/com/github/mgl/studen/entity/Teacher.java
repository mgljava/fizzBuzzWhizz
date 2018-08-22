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

  private GameNumber gameNumber;

  public GameNumber say(int fizz, int buzz, int whizz) {
    return new GameNumber(fizz, buzz, whizz);
  }
}