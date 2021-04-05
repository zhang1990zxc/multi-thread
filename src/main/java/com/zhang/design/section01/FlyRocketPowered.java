package com.zhang.design.section01;

/**
 * @ClassName FlyRocketPowered
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/11 22:12
 * @Version 1.0
 **/
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
