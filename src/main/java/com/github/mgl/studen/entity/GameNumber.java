package com.github.mgl.studen.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameNumber {

  private Integer fizz;
  private Integer buzz;
  private Integer whizz;
}
