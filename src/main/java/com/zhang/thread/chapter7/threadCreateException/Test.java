package com.zhang.thread.chapter7.threadCreateException;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/27 1:30
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("线程：" + t.getName()+"出现了异常：");
            e.printStackTrace();
        });
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
