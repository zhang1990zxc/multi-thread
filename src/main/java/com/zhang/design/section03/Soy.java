package com.zhang.design.section03;

/**
 * @ClassName Mocha
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/21 14:51
 * @Version 1.0
 **/
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.40 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，Soy";
    }
}
