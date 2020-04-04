package com.zhang.thread.chapter1.t15;

/**
 * @ClassName Synchronized
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 11:01
 * @Version 1.0
 **/
public class SynchronizedObject {

    synchronized public void printString() {
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }

}
