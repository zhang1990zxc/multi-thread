package com.zhang.thread.chapter3.join_sleep_1;

/**
 * @ClassName ThreadB
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 1:47
 * @Version 1.0
 **/
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(" b run begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" b run   end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("答应了bService timer=" + System.currentTimeMillis());
    }
}
