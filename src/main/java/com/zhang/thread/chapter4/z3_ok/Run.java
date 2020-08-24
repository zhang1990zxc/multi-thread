package com.zhang.thread.chapter4.z3_ok;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 13:59
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a1 = new ThreadA(myService);
        ThreadA a2 = new ThreadA(myService);
        ThreadA a3 = new ThreadA(myService);
        a1.start();
        a2.start();
        a3.start();
    }
}
