package com.zhang.thread.chapter6.singleton_0;

/**
 * @ClassName MyObject
 * @Description 立即加载/饿汉模式（线程不安全）
 * @Author 天涯
 * @Date 2020/8/25 0:50
 * @Version 1.0
 **/
public class MyObject {

    private static MyObject myObject = new MyObject();

    private MyObject() {}

    public static MyObject getInstance() {
        return myObject;
    }

}
