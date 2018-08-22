package com.github.mgljava.strategy;

public interface CountOffRule {

  String FIZZ = "Fizz";
  String BUZZ = "Buzz";
  String WHIZZ = "Whizz";
  String FIZZ_BUZZ = "FizzBuzz";
  String FIZZ_WHIZZ = "FizzWhizz";
  String BUZZ_WHIZZ = "BuzzWhizz";
  String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";


  boolean sayResultByNumber(int currentNumber);
}
