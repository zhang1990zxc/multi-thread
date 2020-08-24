package com.zhang.thread.chapter4.tryLockTest;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 19:25
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        final MyService myService = new MyService();

        Runnable runnable = myService::waitMethod;

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();

    }
}
