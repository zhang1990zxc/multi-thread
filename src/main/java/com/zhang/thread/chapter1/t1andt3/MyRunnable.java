package com.zhang.thread.chapter1.t1andt3;

/**
 * @ClassName MyRunnable
 * @Description 通过实现Runnable接口，实现多线程编程
 * @see java.lang.Runnable
 * @Author zhang
 * @Date 2020/2/8 15:23
 * @Version 1.0
 **/
public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("运行中！");
    }
}
