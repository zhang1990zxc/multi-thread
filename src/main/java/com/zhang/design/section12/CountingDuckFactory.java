package com.zhang.design.section12;

/**
 * @ClassName CountingDuckFactory
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/5 16:01
 * @Version 1.0
 **/
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
