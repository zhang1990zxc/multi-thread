package com.zhang.thread.chapter2.synLockIn_2;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:29
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
