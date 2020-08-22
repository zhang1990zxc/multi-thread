package com.zhang.thread.chapter3.threadLocalExt;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 3:32
 * @Version 1.0
 **/
public class Run {
    private static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("在main线程中取值=" + Tools.t1.get());
            Thread.sleep(100);
        }
        Thread.sleep(5000);
        ThreadA a = new ThreadA();
        a.start();
    }
}
