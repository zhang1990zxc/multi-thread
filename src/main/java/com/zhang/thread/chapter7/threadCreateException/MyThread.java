package com.zhang.thread.chapter7.threadCreateException;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/27 1:29
 * @Version 1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }

}
