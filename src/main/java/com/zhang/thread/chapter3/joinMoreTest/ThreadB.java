package com.zhang.thread.chapter3.joinMoreTest;

/**
 * @ClassName ThreadB
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 2:01
 * @Version 1.0
 **/
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {
        try {
            System.out.println("begin B ThreadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(500);
            System.out.println("  end B ThreadName=" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
