package com.zhang.thread.chapter6.singleton_2;

/**
 * @ClassName MyObject
 * @Description 同步方法实现单例模式
 * @Author 天涯
 * @Date 2020/8/25 0:55
 * @Version 1.0
 **/
public class MyObject {

    private static MyObject myObject;

    private MyObject() {}

    synchronized public static MyObject getInstance() {
        try {
            if (myObject != null) {
            }else {
                //模拟前期准备工作
                Thread.sleep(3000);
                myObject = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
