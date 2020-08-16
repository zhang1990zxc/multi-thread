package com.zhang.thread.chapter2.synNotExtends;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:56
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();

        ThreadA a = new ThreadA(sub);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(sub);
        b.setName("B");
        b.start();
    }
}
