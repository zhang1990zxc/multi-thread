package com.zhang.thread.chapter3.joinMoreTest;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 2:01
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
                System.out.println("begin A ThreadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(500);
                System.out.println("  end A ThreadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
