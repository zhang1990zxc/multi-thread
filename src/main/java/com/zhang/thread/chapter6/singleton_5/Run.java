package com.zhang.thread.chapter6.singleton_5;

/**
 * @ClassName Run
 * @Description
 * @Author 天涯
 * @Date 2020/8/25 0:52
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
