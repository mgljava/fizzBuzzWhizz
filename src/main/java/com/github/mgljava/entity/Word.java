package com.github.mgljava.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Word {

  private Integer fizz;
  private Integer buzz;
  private Integer whizz;
}
