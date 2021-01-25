package com.zhang.concurrency.chapter8;

/**
 * @ClassName JoinCountDownLatchTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/24 23:46
 * @Version 1.0
 **/
public class JoinCountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> System.out.println("thread1 finish"));

        Thread thread2 = new Thread(() -> System.out.println("thread2 finish"));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("all finish");
    }
}
