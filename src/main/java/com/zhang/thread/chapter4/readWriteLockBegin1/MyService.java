package com.zhang.thread.chapter4.readWriteLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName MyService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 20:08
 * @Version 1.0
 **/
public class MyService {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private String username = "abc";

    public void testMethod() {
        try {
            lock.readLock().lock();
            System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            System.out.println("print service " + username);
            Thread.sleep(4000);
            System.out.println("  end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
