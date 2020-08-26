package com.zhang.thread.chapter6.singleton_3;

/**
 * @ClassName MyObject
 * @Description dcl实现线程安全的单例模式
 * @Author 天涯
 * @Date 2020/8/25 0:55
 * @Version 1.0
 **/
public class MyObject {

    private volatile static MyObject myObject;

    private MyObject() {}

    public static MyObject getInstance() {
        try {
            if (myObject == null)
                //模拟前期准备工作
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
