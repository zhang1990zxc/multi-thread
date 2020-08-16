package com.zhang.thread.chapter2.synLockIn_1;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:15
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
