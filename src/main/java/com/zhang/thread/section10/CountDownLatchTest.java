package com.zhang.thread.section10;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchTest
 * @Description {@link CountDownLatch}
 * @Author 天涯
 * @Date 2020/9/9 20:24
 * @Version 1.0
 **/
public class CountDownLatchTest {

    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("child threadOne over");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        Thread threadTwo = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("child threadTwo over");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        threadOne.start();
        threadTwo.start();

        System.out.println("wait all child thread over!");

        countDownLatch.await();

        System.out.println("all child thread over!");
    }

}
