package com.zhang.thread.chapter1.sameNum;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 17:12
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
