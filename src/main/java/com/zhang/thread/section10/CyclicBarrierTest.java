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
public class CyclicBarrierTest {

    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () -> System.out.println(Thread.currentThread()+"task1 merge result"));

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread()+" task1-1");
                System.out.println(Thread.currentThread()+" enter in CyclicBarrier");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread()+" enter out CyclicBarrier");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread()+" task1-2");
                System.out.println(Thread.currentThread()+" enter in CyclicBarrier");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread()+" enter out CyclicBarrier");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();
    }

}
