package com.zhang.concurrency.chapter8;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/24 23:54
 * @Version 1.0
 **/
public class CountDownLatchTest {

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                countDownLatch.countDown();
                System.out.println(2);
                countDownLatch.countDown();
            }
        }).start();
        countDownLatch.await();
        System.out.println(3);
    }

}
