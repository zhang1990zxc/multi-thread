package com.zhang.thread.chapter3.join_sleep_2;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 1:46
 * @Version 1.0
 **/
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                b.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String s = new String();
                    System.out.println(Math.random());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
