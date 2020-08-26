package com.zhang.thread.chapter6.singleton_0;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/25 0:51
 * @Version 1.0
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
