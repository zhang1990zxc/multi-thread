package com.zhang.thread.chapter2.synchronizedBlockLockAll;

/**
 * @ClassName MyObject
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 23:29
 * @Version 1.0
 **/
public class MyObject {
    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString ____getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
            System.out.println("----------------------------------------");
            System.out.println("speedPrintString releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
        }
    }
}
