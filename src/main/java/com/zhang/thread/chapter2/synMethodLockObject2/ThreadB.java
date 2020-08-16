package com.zhang.thread.chapter2.synMethodLockObject2;

/**
 * @ClassName ThreadB
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/20 20:07
 * @Version 1.0
 **/
public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }

}
