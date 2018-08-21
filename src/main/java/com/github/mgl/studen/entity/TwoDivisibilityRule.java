package com.github.mgl.contract;

import com.github.mgl.entity.Teacher;

public class TwoDivisibilityRule implements CountOffRule {

    private Teacher teacher;

    public TwoDivisibilityRule(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean sayResultByNumber(int currentNumber) {
        boolean flag = false;

        if (currentNumber % teacher.getFizz() == 0 &&
                currentNumber % teacher.getBuzz() == 0 &&
                currentNumber % teacher.getWhizz() == 0) {
            System.out.println(FIZZ_BUZZ_WHIZZ);
            flag = true;
        }

        if (currentNumber % teacher.getFizz() == 0 && currentNumber % teacher.getBuzz() == 0) {
            System.out.println(FIZZ_BUZZ);
            flag = true;
        }
        if (currentNumber % teacher.getFizz() == 0 && currentNumber % teacher.getWhizz() == 0) {
            System.out.println(FIZZ_WHIZZ);
            flag = true;
        }
        if (currentNumber % teacher.getBuzz() == 0 && currentNumber % teacher.getWhizz() == 0) {
            System.out.println(BUZZ_WHIZZ);
            flag = true;
        }
        return flag;
    }
}
