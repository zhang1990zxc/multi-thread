package com.zhang.thread.chapter3.join_sleep_2;

/**
 * @ClassName ThreadC
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 1:50
 * @Version 1.0
 **/
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
