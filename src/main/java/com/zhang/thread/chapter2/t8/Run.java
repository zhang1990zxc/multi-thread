package com.zhang.thread.chapter2.t8;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 22:30
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        Thread.sleep(10);

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }

}
