package com.zhang.thread.chapter3.pepeInputOutput;

import java.io.PipedInputStream;

/**
 * @ClassName ThreadRead
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 0:06
 * @Version 1.0
 **/
public class ThreadRead extends Thread {

    private ReadData readData;

    private PipedInputStream input;

    public ThreadRead(ReadData readData, PipedInputStream input) {
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}
