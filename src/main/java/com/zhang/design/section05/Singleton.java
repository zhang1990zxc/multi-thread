package com.zhang.design.section05;

/**
 * @ClassName Singleton
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:58
 * @Version 1.0
 **/
public class Singleton {

    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

}
