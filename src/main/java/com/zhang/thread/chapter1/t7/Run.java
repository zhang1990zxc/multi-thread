package com.zhang.thread.chapter1.t7;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 18:13
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin =="+myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end =="+myThread.isAlive());
    }
}
