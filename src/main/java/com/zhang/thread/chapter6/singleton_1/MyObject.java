package com.zhang.thread.chapter6.singleton_1;

/**
 * @ClassName MyObject
 * @Description 延迟加载/懒汉模式（线程不安全）
 * @Author 天涯
 * @Date 2020/8/25 0:55
 * @Version 1.0
 **/
public class MyObject {

    private static MyObject myObject;

    private MyObject() {}

    public static MyObject getInstance() {
        if (myObject != null) {
        }else {
            myObject = new MyObject();
        }
        return myObject;
    }

}
