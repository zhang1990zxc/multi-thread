package com.zhang.thread.chapter4.tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 19:24
 * @Version 1.0
 **/
public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");
        }else{
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }

}
