package com.zhang.thread.chapter1.useReturnInterrupt;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:22
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
    }
}
