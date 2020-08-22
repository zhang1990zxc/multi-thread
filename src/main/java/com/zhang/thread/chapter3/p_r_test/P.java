package com.zhang.thread.chapter3.p_r_test;

/**
 * @ClassName P
 * @Description 生产者
 * @Author 天涯
 * @Date 2020/8/20 0:19
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
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是" + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
