package com.zhang.design.section06;

import com.zhang.design.section06.simple.Command;

/**
 * @ClassName NoCommand
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/22 0:45
 * @Version 1.0
 **/
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("没有命令!");
    }
}
