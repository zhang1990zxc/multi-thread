package com.zhang.thread.chapter4.fair_noFair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 16:19
 * @Version 1.0
 **/
public class MyService {

    public Lock lock;

    public MyService(boolean fair) {
        lock = new ReentrantLock(fair);
    }

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("testMethod "+Thread.currentThread().getName());
            Thread.sleep(500);
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
