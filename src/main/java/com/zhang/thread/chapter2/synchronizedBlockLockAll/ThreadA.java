package com.zhang.thread.chapter2.synchronizedBlockLockAll;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 22:47
 * @Version 1.0
 **/
public class ThreadA extends Thread {

    private Service service;

    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        service.testMethod1(object);
    }
}
