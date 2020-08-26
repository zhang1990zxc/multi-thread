package com.zhang.thread.chapter5.timerTest5;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName MyTask
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/25 0:28
 * @Version 1.0
 **/
public class MyTask extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("begin timer=" + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("  end timer=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        long nowTime = System.currentTimeMillis();
        Timer timer = new Timer();
        timer.schedule(myTask, new Date(nowTime), 3000);
    }
}
