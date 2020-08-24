package com.zhang.thread.chapter4.lockInterruptibly;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 19:08
 * @Version 1.0
 **/
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    public void testMethod() {
        try {
            lock.lockInterruptibly();
            System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String s = new String();
                Math.random();
            }
            System.out.println("  end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
