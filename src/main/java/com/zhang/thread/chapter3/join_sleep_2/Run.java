package com.zhang.thread.chapter3.join_sleep_2;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 1:51
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();

        ThreadA a = new ThreadA(b);
        a.start();

        Thread.sleep(1000);

        ThreadC c= new ThreadC(b);
        c.start();
    }
}
