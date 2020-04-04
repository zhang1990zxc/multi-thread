package com.zhang.thread.chapter1.t17;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 11:58
 * @Version 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count = count + (i+1);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时："+(end-begin)+"毫秒！");
    }
}
