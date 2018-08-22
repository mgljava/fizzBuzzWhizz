package com.github.mgljava.strategy;

import com.github.mgl.studen.entity.Words;

public interface Rule {



  String FIZZ = "Fizz";
  String BUZZ = "Buzz";
  String WHIZZ = "Whizz";
  String FIZZ_BUZZ = "FizzBuzz";
  String FIZZ_WHIZZ = "FizzWhizz";
  String BUZZ_WHIZZ = "BuzzWhizz";
  String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

  String get(int position, Words words);

  boolean isApplicable();
}
