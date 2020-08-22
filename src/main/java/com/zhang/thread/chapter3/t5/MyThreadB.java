package com.zhang.thread.chapter3.t5;

/**
 * @ClassName MyThreadB
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 3:23
 * @Version 1.0
 **/
public class MyThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set("B " + (i + 1));
                }
                System.out.println("B get " + Tools.t1.get());
                int sleepValue = (int) (Math.random() * 1000);
                Thread.sleep(sleepValue);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
