package com.github.mgljava;

import com.github.mgljava.entity.Student;
import com.github.mgljava.entity.Teacher;
import com.github.mgljava.entity.Words;
import com.github.mgljava.strategy.RuleEngine;

public class StudentTest {

  public static void main(String[] args) {
    Words words = new Teacher().say(3, 5, 7);
    RuleEngine ruleEngine = new RuleEngine(words);
    for (int i = 1; i < 100; i++) {
      Student student = new Student(ruleEngine, i);
      System.out.println(student.count());
    }
  }
}
