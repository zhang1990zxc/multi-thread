package com.zhang.thread.chapter2.synLockIn_2;

/**
 * @ClassName Main
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:22
 * @Version 1.0
 **/
public class Main {

    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
