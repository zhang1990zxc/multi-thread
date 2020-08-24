package com.zhang.thread.chapter4.useConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 14:10
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        /*MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        Thread.sleep(3000);
        myService.signal();*/

        Lock lock = new ReentrantLock();
        lock.lock();
        Condition condition = lock.newCondition();
        System.out.println("await begin");
        condition.await();
        System.out.println("await end");
    }
}
