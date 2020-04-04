package com.zhang.thread.chapter1.t6;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 17:23
 * @Version 1.0
 **/
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法的打印："+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印："+Thread.currentThread().getName());
    }
}
