package com.zhang.thread.section11;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName TestTimer
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/11 1:00
 * @Version 1.0
 **/
public class TestTimer {
    private static Timer timer = new Timer();

    public static void main(String[] args) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("------one Task-----");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                throw new RuntimeException("error");
            }
        }, 500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("------two Task-----");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 1000);
    }

}
