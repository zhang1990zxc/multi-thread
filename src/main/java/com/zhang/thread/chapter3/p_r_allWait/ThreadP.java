package com.zhang.thread.chapter3.p_r_allWait;

/**
 * @ClassName ThreadAdd
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/19 23:54
 * @Version 1.0
 **/
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
