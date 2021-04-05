package com.zhang.design.section01;

/**
 * @ClassName MuteQuack
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/11 21:55
 * @Version 1.0
 **/
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
