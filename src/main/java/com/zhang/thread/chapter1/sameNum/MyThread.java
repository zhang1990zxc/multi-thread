package com.zhang.thread.chapter1.sameNum;

/**
 * @ClassName MyThread
 * @Description 留意i--与System.out.println()出现的非线程安全问题
 * @Author zhang
 * @Date 2020/2/8 17:10
 * @Version 1.0
 **/
public class MyThread extends Thread {

    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}
