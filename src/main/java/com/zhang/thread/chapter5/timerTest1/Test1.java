package com.zhang.thread.chapter5.timerTest1;

import java.util.Date;
import java.util.Timer;

/**
 * @ClassName Test1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/24 23:41
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        long nowTime = System.currentTimeMillis();
        System.out.println("当前时间为：" + nowTime);

        long scheduleTime = (nowTime + 10000);
        System.out.println("计划时间为：" + scheduleTime);

        MyTask task = new MyTask();

        Timer timer = new Timer();
//        Thread.sleep(1000);
        timer.schedule(task, new Date(scheduleTime));
//        Thread.sleep(Integer.MAX_VALUE);
    }
}
