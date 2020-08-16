package com.zhang.thread.chapter2.synLockIn_1;

/**
 * @ClassName Service
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:11
 * @Version 1.0
 **/
public class Service {

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }

}
