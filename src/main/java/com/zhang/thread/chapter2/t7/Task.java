package com.zhang.thread.chapter2.t7;

/**
 * @ClassName Task
 * @Description 一半异步，一半同步
 * @Author 天涯
 * @Date 2020/8/16 16:22
 * @Version 1.0
 **/
public class Task {

    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("noSynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println();
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }

}
