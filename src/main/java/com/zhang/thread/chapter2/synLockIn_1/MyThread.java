package com.zhang.thread.chapter2.synLockIn_1;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:14
 * @Version 1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
