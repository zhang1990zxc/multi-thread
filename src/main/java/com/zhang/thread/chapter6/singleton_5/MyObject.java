package com.zhang.thread.chapter6.singleton_5;

/**
 * @ClassName MyObject
 * @Description 静态代码块实现单例模式
 * @Author 天涯
 * @Date 2020/8/25 0:55
 * @Version 1.0
 **/
public class MyObject {

    private static MyObject instance = null;

    private MyObject() {}

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }

}
