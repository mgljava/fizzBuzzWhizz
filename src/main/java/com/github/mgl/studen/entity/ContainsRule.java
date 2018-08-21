package com.github.mgl.contract;

import com.github.mgl.entity.Teacher;

public class ContainsRule implements CountOffRule {

    private Teacher teacher;

    public ContainsRule(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean sayResultByNumber(int currentNumber) {
        boolean flag = false;

        if (String.valueOf(currentNumber).contains(String.valueOf(teacher.getFizz()))) {
            System.out.println(FIZZ);
            flag = true;
        }
        if (String.valueOf(currentNumber).contains(String.valueOf(teacher.getBuzz()))) {
            System.out.println(BUZZ);
            flag = true;
        }
        if (String.valueOf(currentNumber).contains(String.valueOf(teacher.getWhizz()))) {
            System.out.println(WHIZZ);
            flag = true;
        }
        return flag;
    }
}
