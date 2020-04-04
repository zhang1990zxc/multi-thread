package com.zhang.thread.chapter1.t17;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 12:01
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
