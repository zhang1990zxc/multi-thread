package com.zhang.thread.chapter5.timerTest2_period;

import java.util.TimerTask;

/**
 * @ClassName MyTask
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/25 0:12
 * @Version 1.0
 **/
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为：" + System.currentTimeMillis());
    }
}
