package com.zhang.thread.section01.threadLocal;

/**
 * @ClassName TestThreadLocal
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/2 1:14
 * @Version 1.0
 **/
public class TestThreadLocal {

    public static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello world");
        Thread thread = new Thread(() -> System.out.println("thread:" + threadLocal.get()));
        thread.start();
        System.out.println("main:" + threadLocal.get());
    }
}
