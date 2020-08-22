package com.zhang.thread.chapter3.p_r_allWait;

/**
 * @ClassName P
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 22:44
 * @Version 1.0
 **/
public class P {

    private String lock;

    public P(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者 " + Thread.currentThread().getName() + " WAITING了*");
                    lock.wait();
                }
                System.out.println("生产者 " + Thread.currentThread().getName() + " RUNNABLE了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
