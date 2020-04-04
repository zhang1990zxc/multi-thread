package com.zhang.thread.chapter1.stopThrowLock;

/**
 * @ClassName MyThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:09
 * @Version 1.0
 **/
public class MyThreadA extends Thread {

    private MyService object;

    public MyThreadA(MyService object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
