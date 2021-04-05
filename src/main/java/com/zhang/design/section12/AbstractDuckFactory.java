package com.zhang.design.section12;

/**
 * @ClassName AbstractDuckFactory
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/5 16:00
 * @Version 1.0
 **/
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
