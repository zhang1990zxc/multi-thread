package com.zhang.thread.chapter4.reentrantLock;

/**
 * @ClassName RUn
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 4:14
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();

        MyThread myThread1 = new MyThread(myService);
        MyThread myThread2 = new MyThread(myService);
        MyThread myThread3 = new MyThread(myService);
        MyThread myThread4 = new MyThread(myService);
        MyThread myThread5 = new MyThread(myService);
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
