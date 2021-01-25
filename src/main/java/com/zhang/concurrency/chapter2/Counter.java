package com.zhang.concurrency.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName Counter
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/6 0:02
 * @Version 1.0
 **/
public class Counter {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private int i = 0;

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();
        List<Thread> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        counter.count();
                        counter.safeCount();
                    }
                }
            });
            list.add(thread);
        }

        for (Thread thread : list) {
            thread.start();
        }

        for (Thread thread : list) {
            thread.join();
        }

        System.out.println(counter.i);
        System.out.println(counter.atomicInteger.get());
        System.out.println(System.currentTimeMillis() - start);

    }

    private void safeCount() {
        for (; ; ) {
            int i = atomicInteger.get();
            boolean b = atomicInteger.compareAndSet(i, ++i);
            if (b)
                break;
        }
    }

    private void count() {
        i++;
    }

}
