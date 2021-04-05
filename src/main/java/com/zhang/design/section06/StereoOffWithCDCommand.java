package com.zhang.design.section06;

import com.zhang.design.section06.simple.Command;

/**
 * @ClassName LightOffCommand
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/22 0:51
 * @Version 1.0
 **/
public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
