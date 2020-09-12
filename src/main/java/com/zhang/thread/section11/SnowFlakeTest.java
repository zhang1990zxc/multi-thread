package com.zhang.thread.section11;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName SnowFlakeTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/10 22:36
 * @Version 1.0
 **/
public class SnowFlakeTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Snowflake snowflake = IdUtil.createSnowflake(0, 1);
        for (int i = 0; i < 20; i++) {
            executorService.submit(() -> {

                System.out.println(Thread.currentThread().getName() + "线程的雪花ID："+ snowflake.nextId());
            });
        }
        executorService.shutdown();
    }
}
