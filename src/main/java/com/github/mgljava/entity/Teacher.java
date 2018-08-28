package com.github.mgljava.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

  private Word word;

  public Word say(int fizz, int buzz, int whizz) {
    return new Word(fizz, buzz, whizz);
  }
}
