package com.zhang.thread.chapter7.stateTest1;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/26 0:18
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            System.out.println("main方法中的状态1：" + myThread.getState());
            Thread.sleep(1000);
            myThread.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2：" + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
