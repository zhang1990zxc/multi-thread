package com.zhang.thread.chapter3.pipeReaderWriter;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @ClassName ThreadWrite
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 0:05
 * @Version 1.0
 **/
public class ThreadWrite extends Thread {

    private WriteData writeData;

    private PipedWriter out;

    public ThreadWrite(WriteData writeData, PipedWriter out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
