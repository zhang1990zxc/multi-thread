package com.zhang.thread.chapter1.t18;

/**
 * @ClassName MyThread2
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 12:18
 * @Version 1.0
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority="+this.getPriority());
    }
}
