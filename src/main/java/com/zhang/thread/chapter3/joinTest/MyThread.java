package com.zhang.thread.chapter3.joinTest;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 1:09
 * @Version 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            System.out.println("我想当myThread对象执行完毕后我在执行，我做到了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
