package com.zhang.design.section12;

/**
 * @ClassName QuackCounter
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/5 15:52
 * @Version 1.0
 **/
public class QuackCounter implements Quackable {

    Quackable quackable;

    private static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

}
