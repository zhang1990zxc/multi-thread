package com.zhang.thread.chapter2.twoObjectTwoLock;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/12 13:55
 * @Version 1.0
 **/
public class ThreadB extends Thread {
    private HasSelfPrivateNum num;

    public ThreadB(HasSelfPrivateNum num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.addNum("b");
    }
}
