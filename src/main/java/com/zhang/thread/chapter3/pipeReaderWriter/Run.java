package com.zhang.thread.chapter3.pipeReaderWriter;

import java.io.*;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 0:07
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedWriter out = new PipedWriter();
            PipedReader in = new PipedReader();

            out.connect(in);

            ThreadRead read = new ThreadRead(readData, in);
            read.start();

            Thread.sleep(2000);

            ThreadWrite write = new ThreadWrite(writeData, out);
            write.start();

        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
