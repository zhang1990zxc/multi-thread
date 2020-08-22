package com.zhang.thread.chapter3.waitOld;

/**
 * @ClassName ThreadAdd
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/19 23:54
 * @Version 1.0
 **/
public class ThreadAdd extends Thread {

    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
