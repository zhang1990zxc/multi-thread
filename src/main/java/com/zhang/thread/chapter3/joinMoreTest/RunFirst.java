package com.zhang.thread.chapter3.joinMoreTest;

/**
 * @ClassName RunFirst
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 2:10
 * @Version 1.0
 **/
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("                   main end " + System.currentTimeMillis());
    }
}
