package com.github.mgljava;

import static org.junit.Assert.assertEquals;

import com.github.mgljava.entity.Student;
import com.github.mgljava.entity.Teacher;
import com.github.mgljava.entity.Words;
import com.github.mgljava.strategy.ContainsRule;
import com.github.mgljava.strategy.Rule;
import com.github.mgljava.strategy.RuleEngine;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class StudentTest {

  @Test
  void should_get_fizz_by_contains_rule() {
    // given
    Words words = new Teacher().say(3, 5, 7);
    Rule rule = new ContainsRule();
    RuleEngine ruleEngine = new RuleEngine(words, Arrays.asList(rule));
    Student student = new Student(ruleEngine, 3);


    // when
    String result = student.count();

    // then
    assertEquals("Fizz", result);
  }
}
