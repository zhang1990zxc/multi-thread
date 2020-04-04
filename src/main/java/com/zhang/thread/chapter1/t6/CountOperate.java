package com.zhang.thread.chapter1.t6;

/**
 * @ClassName CountOperate
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 17:40
 * @Version 1.0
 **/
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run---end");
    }
}
