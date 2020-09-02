package com.zhang.thread.section01.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName Test
 * @Description FutureTask方式实现
 * @Author 天涯
 * @Date 2020/8/30 13:36
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(new CallTask());
        new Thread(futureTask).start();
        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
