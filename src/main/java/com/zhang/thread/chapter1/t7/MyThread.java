package com.zhang.thread.chapter1.t7;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 18:11
 * @Version 1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run="+this.isAlive());
    }
}
