package com.zhang.thread.chapter3.pepeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @ClassName ReadData
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:56
 * @Version 1.0
 **/
public class ReadData {

    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read :");
            byte[] bytes = new byte[20];
            int readLength = input.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.print(newData);
                readLength = input.read(bytes);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
