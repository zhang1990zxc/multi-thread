package com.zhang.thread.chapter3.p_r_test;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 0:27
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);

        threadP.start();
        threadC.start();
    }
}
