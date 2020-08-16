package com.zhang.thread.chapter2.synNotExtends;

/**
 * @ClassName ThreadB
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/20 20:07
 * @Version 1.0
 **/
public class ThreadB extends Thread {

    private Sub sub;

    public ThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
        sub.serviceMethod();
    }

}
