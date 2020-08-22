package com.zhang.thread.chapter3.pepeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @ClassName WriteData
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:53
 * @Version 1.0
 **/
public class WriteData {

    public void writeMethod(PipedOutputStream pipedOutputStream) {
        try {
            System.out.println("write :");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i+1);
                pipedOutputStream.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            pipedOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
