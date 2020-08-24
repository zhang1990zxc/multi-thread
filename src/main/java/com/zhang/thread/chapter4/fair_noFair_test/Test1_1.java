package com.zhang.thread.chapter4.fair_noFair_test;

/**
 * @ClassName Test1_1
 * @Description 公平锁和非公平锁
 * @Author 天涯
 * @Date 2020/8/23 16:23
 * @Version 1.0
 **/
public class Test1_1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService(false);

        MyThread[] myThreads1 = new MyThread[10];
        MyThread[] myThreads2 = new MyThread[10];

        for (int i = 0; i < myThreads1.length; i++) {
            myThreads1[i] = new MyThread(service);
            myThreads1[i].setName("array1+++ " + (i + 1));
        }

        for (int i = 0; i < myThreads1.length; i++) {
            myThreads1[i].start();
        }

        for (int i = 0; i < myThreads2.length; i++) {
            myThreads2[i] = new MyThread(service);
            myThreads2[i].setName("array2--- " + (i + 1));
        }

        Thread.sleep(500);

        for (int i = 0; i < myThreads2.length; i++) {
            myThreads2[i].start();
        }

    }
}
