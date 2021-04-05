package com.zhang.design.section06.simple;

/**
 * @ClassName Command
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/21 19:35
 * @Version 1.0
 **/
public interface Command {

    void execute();

    default void undo(){};
}
