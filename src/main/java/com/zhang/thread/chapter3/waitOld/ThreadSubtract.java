package com.zhang.thread.chapter3.waitOld;

/**
 * @ClassName ThreadAdd
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/19 23:54
 * @Version 1.0
 **/
public class ThreadSubtract extends Thread {

    private Subtract r;

    public ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
