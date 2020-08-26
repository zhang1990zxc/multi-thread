package com.zhang.thread.chapter5.timerTest5;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/25 0:41
 * @Version 1.0
 **/
public class Test2 {

    static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("begin timer=" + System.currentTimeMillis());
            System.out.println("  end timer=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        long nowTime = System.currentTimeMillis();
        System.out.println("现在执行时间为：" + nowTime);
        long runTime = nowTime - 20000;
        System.out.println("计划执行时间为：" + runTime);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTask, new Date(runTime), 2000);
    }

}
