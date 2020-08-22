package com.zhang.thread.chapter3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

/**
 * @ClassName ReadData
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:56
 * @Version 1.0
 **/
public class ReadData {

    public void readMethod(PipedReader input) {
        try {
            System.out.println("read :");
            char[] chars = new char[20];
            int readLength = input.read(chars);
            while (readLength != -1) {
                String newData = new String(chars, 0, readLength);
                System.out.print(newData);
                readLength = input.read(chars);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
