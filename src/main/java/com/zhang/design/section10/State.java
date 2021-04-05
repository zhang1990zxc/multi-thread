package com.zhang.design.section10;

/**
 * @ClassName State
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/3 23:30
 * @Version 1.0
 **/
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

}
