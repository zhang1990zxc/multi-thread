package com.zhang.thread.chapter1.t12;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/9 14:30
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(10);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            System.out.println("是否停止1？="+thread.isInterrupted());
            System.out.println("是否停止2？="+thread.isInterrupted());
        } catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
