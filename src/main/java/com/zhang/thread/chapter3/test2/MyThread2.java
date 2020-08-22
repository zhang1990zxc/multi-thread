package com.zhang.thread.chapter3.test2;

/**
 * @ClassName MyThread1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 23:09
 * @Version 1.0
 **/
public class MyThread2 extends Thread {

    private Object lock;

    public MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始     notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束     notify time=" + System.currentTimeMillis());
        }
    }
}
