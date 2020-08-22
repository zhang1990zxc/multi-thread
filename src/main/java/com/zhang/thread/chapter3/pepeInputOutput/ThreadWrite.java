package com.zhang.thread.chapter3.pepeInputOutput;

import java.io.PipedOutputStream;

/**
 * @ClassName ThreadWrite
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 0:05
 * @Version 1.0
 **/
public class ThreadWrite extends Thread {

    private WriteData writeData;

    private PipedOutputStream out;

    public ThreadWrite(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
