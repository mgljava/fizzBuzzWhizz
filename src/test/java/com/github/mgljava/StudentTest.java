package com.github.mgljava;

import static org.junit.Assert.assertEquals;

import com.github.mgljava.entity.Student;
import com.github.mgljava.entity.Teacher;
import com.github.mgljava.entity.Words;
import com.github.mgljava.strategy.ContainsRule;
import com.github.mgljava.strategy.Rule;
import com.github.mgljava.strategy.RuleEngine;
import com.github.mgljava.strategy.TwoDivisibilityRule;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class StudentTest {

  Words words = new Teacher().say(3, 5, 7);

  @Test
  void should_get_fizz_by_contains_rule() {
    // given
    RuleEngine ruleEngine = getRuleEngine(words, new ContainsRule());
    Student student = new Student(ruleEngine, 3);

    // when
    String result = student.count();

    // then
    assertEquals("Fizz", result);
  }

  @Test
  void should_get_buzz_by_contains_rule() {
    // given
    RuleEngine ruleEngine = getRuleEngine(words, new ContainsRule());
    Student student = new Student(ruleEngine, 5);

    // when
    String result = student.count();

    // then
    assertEquals("Buzz", result);
  }

  @Test
  void should_get_whizz_by_contains_rule() {
    // given
    RuleEngine ruleEngine = getRuleEngine(words, new ContainsRule());
    Student student = new Student(ruleEngine, 7);

    // when
    String result = student.count();

    // then
    assertEquals("Whizz", result);
  }

  @Test
  void should_get_fizz_buzz_by_twoDivisibility_rule() {
    // given
    RuleEngine ruleEngine = getRuleEngine(words, new TwoDivisibilityRule());
    Student student = new Student(ruleEngine, 15);

    // when
    String result = student.count();

    // then
    assertEquals("FizzBuzz", result);
  }

  @Test
  void should_get_fizz_whizz_by_twoDivisibility_rule() {
    // given
    RuleEngine ruleEngine = getRuleEngine(words, new TwoDivisibilityRule());
    Student student = new Student(ruleEngine, 21);

    // when
    String result = student.count();

    // then
    assertEquals("FizzWhizz", result);
  }

  @Test
  void should_get_buzz_whizz_by_twoDivisibility_rule() {
    // given
    RuleEngine ruleEngine = getRuleEngine(words, new TwoDivisibilityRule());
    Student student = new Student(ruleEngine, 35);

    // when
    String result = student.count();

    // then
    assertEquals("BuzzWhizz", result);
  }

  private RuleEngine getRuleEngine(Words words, Rule rule) {
    return new RuleEngine(words, Arrays.asList(rule));
  }
}
