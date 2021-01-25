package com.zhang.concurrency.chapter3;

/**
 * @ClassName SafeDoubleCheckLocking
 * @Description 线程安全的double-check
 * @Author 天涯
 * @Date 2021/1/17 21:46
 * @Version 1.0
 **/
public class SafeDoubleCheckLocking {

    private volatile static Instance instance;

    public static Instance getInstance() {
        if (instance == null) {
            synchronized (SafeDoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new Instance();
                }
            }
        }
        return instance;
    }

}
