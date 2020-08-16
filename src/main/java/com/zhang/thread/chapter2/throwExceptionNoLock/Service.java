package com.zhang.thread.chapter2.throwExceptionNoLock;

/**
 * @ClassName Service
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:31
 * @Version 1.0
 **/
public class Service {

    synchronized public void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " run beginTime=" + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + " run exceptionTime=" + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run Time=" + System.currentTimeMillis());
        }
    }

}
