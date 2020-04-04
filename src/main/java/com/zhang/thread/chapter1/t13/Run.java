package com.zhang.thread.chapter1.t13;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/9 14:52
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
