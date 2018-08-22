package com.github.mgljava;

import com.github.mgl.studen.entity.GameNumber;
import com.github.mgl.studen.entity.Student;
import com.github.mgl.studen.entity.Teacher;
import com.github.mgljava.strategy.ContainsRule;
import com.github.mgljava.strategy.DivisibilityRule;
import com.github.mgljava.strategy.TwoDivisibilityRule;

public class StudentTest {

  public static void main(String[] args) {
    GameNumber gameNumber = new Teacher().say(3, 5, 7);

    for (int i = 1; i < 100; i++) {
      Student student = new Student(gameNumber);
      if (student.numberOff(new ContainsRule(), i)) {

      } else if (student.numberOff(new TwoDivisibilityRule(), i)) {

      } else if (student.numberOff(new DivisibilityRule(), i)) {

      } else {
        System.out.println(i);
      }
    }
  }
}
