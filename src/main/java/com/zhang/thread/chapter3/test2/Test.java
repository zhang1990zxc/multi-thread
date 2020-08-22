package com.zhang.thread.chapter3.test2;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 23:13
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        MyThread1 thread1 = new MyThread1(lock);
        thread1.start();

        Thread.sleep(3000);

        MyThread2 thread2 = new MyThread2(lock);
        thread2.start();

    }
}
