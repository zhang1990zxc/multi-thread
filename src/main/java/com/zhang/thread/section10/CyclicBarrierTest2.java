package com.zhang.thread.section10;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CycleBarrierTest
 * @Description {@link CyclicBarrier}
 * @Author 天涯
 * @Date 2020/9/9 20:54
 * @Version 1.0
 **/
public class CyclicBarrierTest2 {

    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread()+" step1");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread()+" step2");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread()+" step3");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread()+" step1");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread()+" step2");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread()+" step3");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();
    }

}
