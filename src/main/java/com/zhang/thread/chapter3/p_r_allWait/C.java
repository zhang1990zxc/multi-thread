package com.zhang.thread.chapter3.p_r_allWait;

/**
 * @ClassName C
 * @Description 消费者
 * @Author 天涯
 * @Date 2020/8/20 0:22
 * @Version 1.0
 **/
public class C {

    private String lock;

    public C(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE了");
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
