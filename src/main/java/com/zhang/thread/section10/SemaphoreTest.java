package com.zhang.thread.section10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ClassName SemaphoreTest
 * @Description {@link java.util.concurrent.Semaphore}
 * @Author 天涯
 * @Date 2020/9/9 21:28
 * @Version 1.0
 **/
public class SemaphoreTest {

    private static final Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            System.out.println(Thread.currentThread()+" over");
            semaphore.release();
        });

        executorService.submit(() -> {
            System.out.println(Thread.currentThread()+" over");
            semaphore.release();
        });

        semaphore.acquire(2);

        System.out.println("all child thread over!");

        executorService.shutdown();

    }

}
