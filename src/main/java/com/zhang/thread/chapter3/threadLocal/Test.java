package com.zhang.thread.chapter3.threadLocal;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 3:24
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();
        a.start();
        b.start();
        for (int i = 0; i < 10; i++) {
            Tools.t1.set("main " + (i + 1));
            System.out.println("main get " + Tools.t1.get());
            int sleepValue = (int) (Math.random() * 1000);
            Thread.sleep(sleepValue);
        }
    }
}
