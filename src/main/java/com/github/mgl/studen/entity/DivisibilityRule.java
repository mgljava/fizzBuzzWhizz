package com.github.mgl.contract;

import com.github.mgl.entity.Teacher;
import lombok.Data;

public class DivisibilityRule implements CountOffRule {

    private Teacher teacher;

    public DivisibilityRule(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean sayResultByNumber(int currentNumber) {
        boolean flag = false;
        if (currentNumber % teacher.getFizz() == 0) {
            System.out.println(FIZZ);
            flag = true;
        }

        if (currentNumber % teacher.getBuzz() == 0) {
            System.out.println(BUZZ);
            flag = true;
        }

        if (currentNumber % teacher.getWhizz() == 0) {
            System.out.println(WHIZZ);
            flag = true;
        }
        return flag;
    }
}
