package com.zhang.thread.section07;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @ClassName TestPriorityBlockingQueue
 * @Description {@link PriorityBlockingQueue}
 * @Author 天涯
 * @Date 2020/9/6 21:29
 * @Version 1.0
 **/
public class TestPriorityBlockingQueue {

    static class Task implements Comparable<Task> {

        private int priority = 0;

        private String taskName;

        @Override
        public int compareTo(Task o) {
            if (this.getPriority() >= o.getPriority()) {
                return 1;
            }
            return -1;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public void doSomeThing() {
            System.out.println(taskName + ":" + priority);
        }
    }

    public static void main(String[] args) {
        PriorityBlockingQueue<Task> priorityBlockingQueue = new PriorityBlockingQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Task task = new Task();
            task.setPriority(random.nextInt(10));
            task.setTaskName("taskName" + i);
            priorityBlockingQueue.offer(task);
        }
        while (!priorityBlockingQueue.isEmpty()) {
            Task task = priorityBlockingQueue.poll();
            if (null != task) {
                task.doSomeThing();
            }
        }
    }


}
