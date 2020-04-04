package com.zhang.thread.chapter1.stopThrowLock;

/**
 * @ClassName MyThreadB
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:11
 * @Version 1.0
 **/
public class MyThreadB extends Thread {
    private MyService object;

    public MyThreadB(MyService object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("username="+object.getUsername());
        System.out.println("password="+object.getPassword());
    }
}
