package com.zhang.design.section06.simple;

/**
 * @ClassName SimpleRemoteControl
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/21 19:41
 * @Version 1.0
 **/
public class SimpleRemoteControl {

    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }


    public void buttonWasPressed() {
        slot.execute();
    }

}
