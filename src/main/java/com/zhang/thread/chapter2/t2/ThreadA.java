package com.zhang.thread.chapter2.t2;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/12 13:55
 * @Version 1.0
 **/
public class ThreadA extends Thread {
    private HasSelfPrivateNum num;

    public ThreadA(HasSelfPrivateNum num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.addNum("a");
    }
}
