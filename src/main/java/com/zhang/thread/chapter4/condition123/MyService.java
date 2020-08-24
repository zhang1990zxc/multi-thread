package com.zhang.thread.chapter4.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 19:57
 * @Version 1.0
 **/
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    volatile private int nextWhoPrint = 1;

    public void testMethod1() {
        try {
            lock.lock();
            while(nextWhoPrint != 1){
                condition.await();
            }
            System.out.println("AAA");
            nextWhoPrint = 2;
            condition.signalAll();
            lock.unlock();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void testMethod2() {
        try {
            lock.lock();
            while(nextWhoPrint != 2){
                condition.await();
            }
            System.out.println("   BBB");
            nextWhoPrint = 3;
            condition.signalAll();
            lock.unlock();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void testMethod3() {
        try {
            lock.lock();
            while(nextWhoPrint != 3){
                condition.await();
            }
            System.out.println("      CCC");
            nextWhoPrint = 1;
            condition.signalAll();
            lock.unlock();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
