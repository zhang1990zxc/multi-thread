package com.zhang.design.section01;

/**
 * @ClassName FlyNoWay
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/11 21:53
 * @Version 1.0
 **/
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm can't fly!");
    }
}
