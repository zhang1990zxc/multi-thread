package com.zhang.thread.chapter1.t18;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 12:19
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority="+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="+Thread.currentThread().getPriority());
        MyThread1 mythread1 = new MyThread1();
        mythread1.start();
    }
}
