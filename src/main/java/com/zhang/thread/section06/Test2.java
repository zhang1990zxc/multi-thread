package com.zhang.thread.section06;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName Test2
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/5 15:50
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("child thread begin park!");
            LockSupport.park();
            System.out.println("child thread unpark!");
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread begin unpark!");
        LockSupport.unpark(thread);
    }
}
