package com.zhang.thread.chapter1.t1andt3;

import com.zhang.thread.chapter1.t1andt3.MyThread;

/**
 * @ClassName Run
 * @Description 测试类
 * @Author zhang
 * @Date 2020/2/8 14:54
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();        d.start();
        e.start();
    }

}
