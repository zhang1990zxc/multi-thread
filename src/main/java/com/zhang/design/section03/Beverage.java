package com.zhang.design.section03;

/**
 * @ClassName Beverage
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/21 14:41
 * @Version 1.0
 **/
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
