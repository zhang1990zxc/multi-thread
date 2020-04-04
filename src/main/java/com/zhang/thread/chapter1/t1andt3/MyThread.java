package com.zhang.thread.chapter1.t1andt3;

/**
 * @ClassName MyThread
 * @Description 通过继承Thread类实现多线程编程
 * @see Thread
 * @Author zhang
 * @Date 2020/2/8 14:49
 * @Version 1.0
 **/
public class MyThread extends Thread{

    /*@Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("run="+Thread.currentThread().getName());
        }
    }*/

    private int count = 5;

    /*public MyThread(String name){
        super();
        this.setName(name);
    }*/

    @Override
    synchronized public void run() {
        super.run();
        /*while(count>0){
            count--;
            System.out.println("由 "+this.currentThread().getName()+ " 计算，count="+count);
        }*/
        count--;
        System.out.println("由 "+this.currentThread().getName()+ " 计算，count="+count);
    }
}
