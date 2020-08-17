package com.zhang.thread.chapter2.t7;

/**
 * @ClassName MyThread1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 15:02
 * @Version 1.0
 **/
public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
