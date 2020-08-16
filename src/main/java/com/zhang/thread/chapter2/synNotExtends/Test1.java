package com.zhang.thread.chapter2.synNotExtends;

/**
 * @ClassName Test1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 16:00
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {
        System.out.println("A " + Thread.currentThread().holdsLock(Test1.class));
        synchronized (Test1.class) {
            System.out.println("B " + Thread.currentThread().holdsLock(Test1.class));
        }

        System.out.println("C " + Thread.currentThread().holdsLock(Test1.class));
    }
}
