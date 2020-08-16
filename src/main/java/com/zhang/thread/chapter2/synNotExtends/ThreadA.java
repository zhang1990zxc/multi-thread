package com.zhang.thread.chapter2.synNotExtends;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/20 20:02
 * @Version 1.0
 **/
public class ThreadA extends Thread {

    private Sub sub;

    public ThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
        sub.serviceMethod();
    }
}
