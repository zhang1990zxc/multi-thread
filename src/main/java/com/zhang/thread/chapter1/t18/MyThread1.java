package com.zhang.thread.chapter1.t18;

/**
 * @ClassName MyThread1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 12:17
 * @Version 1.0
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority="+this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
