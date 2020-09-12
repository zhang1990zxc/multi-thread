package com.zhang.thread.section11;

import java.util.concurrent.*;

/**
 * @ClassName Future
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/12 11:33
 * @Version 1.0
 **/
public class FutureTest {

    public static final ThreadPoolExecutor EXECUTOR = new ThreadPoolExecutor(1, 1, 1L,
            TimeUnit.MINUTES, new ArrayBlockingQueue<>(1), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future funcTrueOne = EXECUTOR.submit(() -> {
                    System.out.println("start run able one");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        Future funcTrueTwo = EXECUTOR.submit(() -> System.out.println("start run able two"));

        Future futureThree = null;
        try {
            futureThree = EXECUTOR.submit(() -> System.out.println("start run able three"));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("task one " + funcTrueOne.get());
        System.out.println("task two " + funcTrueTwo.get());
        System.out.println("task three " + (futureThree == null ? null : futureThree.get()));

        EXECUTOR.shutdown();

    }

}
