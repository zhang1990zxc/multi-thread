package com.zhang.thread.chapter3.wait_notify_size5;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 23:21
 * @Version 1.0
 **/
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                MyList.add();
                if (MyList.size() == 5) {
                    lock.notify();
                    System.out.println("已经发出通知！");
                }
                System.out.println("添加了" + (i + 1) + "个元素！");
            }
        }
    }
}
