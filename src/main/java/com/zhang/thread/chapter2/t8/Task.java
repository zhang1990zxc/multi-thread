package com.zhang.thread.chapter2.t8;

/**
 * @ClassName Task
 * @Description 验证同步代码块synchronized(this)是锁定当前对象
 * @Author 天涯
 * @Date 2020/8/16 22:24
 * @Version 1.0
 **/
public class Task {

    public synchronized void otherMethod() {
        System.out.println("-------------------------------run----otherMethod");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }

}
