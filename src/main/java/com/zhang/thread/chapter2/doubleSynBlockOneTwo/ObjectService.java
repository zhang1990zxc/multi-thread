package com.zhang.thread.chapter2.doubleSynBlockOneTwo;

/**
 * @ClassName ObjectService
 * @Description 代码块间的同步性
 * @Author 天涯
 * @Date 2020/8/16 17:06
 * @Version 1.0
 **/
public class ObjectService {

    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end end=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time=" + System.currentTimeMillis());
            System.out.println("B end end=" + System.currentTimeMillis());
        }
    }

}
