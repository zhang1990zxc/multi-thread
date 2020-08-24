package com.zhang.thread.chapter4.readWriteLockBegin2;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 19:13
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadA b = new ThreadA(myService);
        a.start();
        b.start();
    }
}
