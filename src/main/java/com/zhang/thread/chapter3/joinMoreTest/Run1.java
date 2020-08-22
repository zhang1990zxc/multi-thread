package com.zhang.thread.chapter3.joinMoreTest;

/**
 * @ClassName Run1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 2:04
 * @Version 1.0
 **/
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        b.join(200);
        System.out.println("                   main end " + System.currentTimeMillis());
    }
}
