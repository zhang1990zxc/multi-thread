package com.zhang.thread.chapter1.daemonThread;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 14:37
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        //myThread.setDaemon(true);
        myThread.start();
        Thread.sleep(5000);
        System.out.println("我离开thread对象也不再打印了，也就是停止了！");
    }
}
