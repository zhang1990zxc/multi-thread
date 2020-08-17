package com.zhang.thread.chapter2.t9;


/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 23:15
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();

        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();

        MyThread2 thread2 = new MyThread2(list);
        thread2.setName("B");
        thread2.start();

        Thread.sleep(6000);

        System.out.println("listSize=" + list.getSize());
    }
}
