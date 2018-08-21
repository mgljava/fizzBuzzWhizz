package com.github.mgl.contract;

public interface CountOffRule {

    public final String FIZZ = "Fizz";
    public final String BUZZ = "Buzz";
    public final String WHIZZ = "Whizz";
    public final String FIZZ_BUZZ = "FizzBuzz";
    public final String FIZZ_WHIZZ = "FizzWhizz";
    public final String BUZZ_WHIZZ = "BuzzWhizz";
    public final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";




    boolean sayResultByNumber(int currentNumber);
}
