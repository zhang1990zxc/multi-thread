package com.zhang.thread.section06;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/5 15:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        final Object o = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (o) {
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(() -> {
            synchronized (Test.class) {
                o.notifyAll();
            }
        });
        t2.start();

    }
}
