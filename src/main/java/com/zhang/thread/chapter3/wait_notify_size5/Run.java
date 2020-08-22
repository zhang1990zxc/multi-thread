package com.zhang.thread.chapter3.wait_notify_size5;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 23:28
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        ThreadA threadA = new ThreadA(lock);
        threadA.start();

        Thread.sleep(50);

        ThreadB threadB = new ThreadB(lock);
        threadB.start();
    }
}
