package com.github.mgljava.strategy;

import com.github.mgljava.entity.Word;

public interface Rule {

  String FIZZ = "Fizz";
  String BUZZ = "Buzz";
  String WHIZZ = "Whizz";
  String FIZZ_BUZZ = "FizzBuzz";
  String FIZZ_WHIZZ = "FizzWhizz";
  String BUZZ_WHIZZ = "BuzzWhizz";
  String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

  String getResultByPosition(int position, Word word);

  boolean isApplicable();
}
