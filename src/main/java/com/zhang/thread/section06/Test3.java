package com.zhang.thread.section06;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName Test3
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/5 18:04
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("child thread begin park!");
            while (!Thread.currentThread().isInterrupted()) {
                LockSupport.park();
            }
            System.out.println("child thread unpark!");
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println("main thread begin unpark!");
//        LockSupport.unpark(thread);
        thread.interrupt();
    }
}
