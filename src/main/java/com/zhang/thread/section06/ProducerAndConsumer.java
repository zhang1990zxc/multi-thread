package com.zhang.thread.section06;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;

/**
 * @ClassName ProducerAndConsumer
 * @Description 使用自定义的不可重入独占锁实现消费者生产者模型
 * @Author 天涯
 * @Date 2020/9/6 0:38
 * @Version 1.0
 **/
public class ProducerAndConsumer {

    final static NonReentrantLock lock = new NonReentrantLock();

    final static Condition notFull = lock.newCondition();

    final static Condition notEmpty = lock.newCondition();

    final static Queue<String> queue = new LinkedBlockingDeque<>();

    final static int queueSize = 10;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            lock.lock();
            try {
                while (queue.size() == queueSize) {
                    notEmpty.await();
                }
                queue.add("ele");
                notFull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        Thread consumer = new Thread(() -> {
            lock.lock();
            try {
                while (0 == queue.size()) {
                    notFull.await();
                }
                String ele = queue.poll();
                System.out.println(Thread.currentThread().getName() + ":" + ele);
                notEmpty.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });


        producer.start();
        consumer.start();

    }

}
