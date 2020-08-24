package com.zhang.thread.chapter4.condition123;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 20:02
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 5; i++) {
            ThreadA a = new ThreadA(myService);
            a.start();
            ThreadB b = new ThreadB(myService);
            b.start();
            ThreadC c = new ThreadC(myService);
            c.start();
        }
    }
}
