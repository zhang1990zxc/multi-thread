package com.zhang.thread.chapter2.atomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName AddCountThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 0:44
 * @Version 1.0
 **/
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();

        Thread t1 = new Thread(addCountThread);
        t1.start();


        Thread t2 = new Thread(addCountThread);
        t2.start();


        Thread t3 = new Thread(addCountThread);
        t3.start();


        Thread t4 = new Thread(addCountThread);
        t4.start();


        Thread t5 = new Thread(addCountThread);
        t5.start();

    }
}
