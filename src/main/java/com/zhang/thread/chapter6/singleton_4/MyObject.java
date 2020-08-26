package com.zhang.thread.chapter6.singleton_4;

/**
 * @ClassName MyObject
 * @Description 静态内部类实现单例模式
 * @Author 天涯
 * @Date 2020/8/25 0:55
 * @Version 1.0
 **/
public class MyObject {

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {}

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

}
