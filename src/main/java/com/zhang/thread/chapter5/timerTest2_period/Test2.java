package com.zhang.thread.chapter5.timerTest2_period;

import java.util.Date;
import java.util.Timer;

/**
 * @ClassName Test2
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/25 0:16
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        long nowTime = System.currentTimeMillis();
        System.out.println("当前时间为：" + nowTime);

        long scheduleTime = nowTime - 10000;
        System.out.println("计划时间为：" + scheduleTime);

        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.schedule(myTask, new Date(scheduleTime), 4000);
    }
}
