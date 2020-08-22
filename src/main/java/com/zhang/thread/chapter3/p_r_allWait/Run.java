package com.zhang.thread.chapter3.p_r_allWait;

/**
 * @ClassName RUn
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 22:52
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] threadP = new ThreadP[2];
        ThreadC[] threadC = new ThreadC[2];

        for (int i = 0; i < 2; i++) {
            threadP[i] = new ThreadP(p);
            threadP[i].setName("生产者" + (i + 1));

            threadC[i] = new ThreadC(c);
            threadC[i].setName("生产者" + (i + 1));

            threadP[i].start();
            threadC[i].start();
        }

        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);

        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() + " " + threads[i].getState());
        }
    }
}
