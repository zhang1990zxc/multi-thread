package com.zhang.thread.chapter3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @ClassName WriteData
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:53
 * @Version 1.0
 **/
public class WriteData {

    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i+1);
                out.write(outData);
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
