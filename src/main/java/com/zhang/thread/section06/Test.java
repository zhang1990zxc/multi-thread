package com.zhang.thread.section06;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/5 15:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("begin park!");
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        System.out.println("end park!");
    }
}
