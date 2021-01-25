package com.zhang.concurrency.chapter5;

import com.zhang.concurrency.chapter4.SleepUtils;

import java.util.concurrent.locks.Lock;

/**
 * @ClassName TwinsLockTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/21 1:54
 * @Version 1.0
 **/
public class TwinsLockTest {

    public static void main(String[] args) {
        final Lock lock = new TwinsLock();
        class Worker extends Thread {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepUtils.second(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtils.second(1);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker();
            worker.setDaemon(true);
            worker.start();
        }
        for (int i = 0; i < 10; i++) {
            SleepUtils.second(1);
            System.out.println();
        }

    }

}
