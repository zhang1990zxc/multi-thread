package com.zhang.design.section06;

import com.zhang.design.section06.simple.Command;
import com.zhang.design.section06.simple.Light;

/**
 * @ClassName LightOffCommand
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/22 0:51
 * @Version 1.0
 **/
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
