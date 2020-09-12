package com.zhang.thread.section07;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestDelayQueue
 * @Description {@link DelayQueue}
 * @Author 天涯
 * @Date 2020/9/6 22:32
 * @Version 1.0
 **/
public class TestDelayQueue {

    static class DelayEle implements Delayed {

        private final long delayTime;

        private final long expire;

        private String taskName;

        public DelayEle(long delayTime, String taskName) {
            this.delayTime = delayTime;
            this.taskName = taskName;
            expire = System.currentTimeMillis() + delayTime;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(this.expire - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override
        public String toString() {
            return "DelayEle{" +
                    "delayTime=" + delayTime +
                    ", expire=" + expire +
                    ", taskName='" + taskName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        DelayQueue<DelayEle> delayQueue = new DelayQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            DelayEle element = new DelayEle(random.nextInt(500), "task:" + i);
            delayQueue.offer(element);
        }
        DelayEle ele = null;
        try {
            for (;;) {
                while ((ele=delayQueue.take()) != null) {
                    System.out.println(ele.toString());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
