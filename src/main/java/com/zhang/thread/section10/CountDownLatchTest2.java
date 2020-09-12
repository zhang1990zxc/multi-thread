package com.zhang.thread.section10;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CountDownLatchTest
 * @Description {@link CountDownLatch}
 * @Author 天涯
 * @Date 2020/9/9 20:24
 * @Version 1.0
 **/
public class CountDownLatchTest2 {

    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("child threadOne over");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        executorService.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("child threadTwo over");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        });

        System.out.println("wait all child thread over!");

        countDownLatch.await();
        
        System.out.println("all child thread over!");

        executorService.shutdown();
    }

}
