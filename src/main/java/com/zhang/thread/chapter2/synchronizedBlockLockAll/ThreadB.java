package com.zhang.thread.chapter2.synchronizedBlockLockAll;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 22:47
 * @Version 1.0
 **/
public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.speedPrintString();
    }
}
