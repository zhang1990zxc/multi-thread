package com.zhang.thread.chapter2.synMethodLockObject;

/**
 * @ClassName MyObject
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/4/4 21:49
 * @Version 1.0
 **/
public class MyObject {

    synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
