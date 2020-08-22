package com.zhang.thread.chapter3.test2;

/**
 * @ClassName MyThread1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 23:09
 * @Version 1.0
 **/
public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始     wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束     wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
