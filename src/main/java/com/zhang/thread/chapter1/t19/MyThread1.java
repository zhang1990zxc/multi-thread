package com.zhang.thread.chapter1.t19;

import java.util.Random;

/**
 * @ClassName MyThread1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 12:24
 * @Version 1.0
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        //long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                //addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("★★★★★thread 1 use time="+(endTime-beginTime));
    }
}
