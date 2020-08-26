package com.zhang.thread.chapter7.stateTest1;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/26 0:15
 * @Version 1.0
 **/
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法中的状态 Thread.currentThread().getState()=" + Thread.currentThread().getState());
        System.out.println("构造方法中的状态 this.getState()=" + this.getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态：" + Thread.currentThread().getState());
    }
}
