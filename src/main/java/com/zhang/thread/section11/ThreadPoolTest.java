package com.zhang.thread.section11;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ThreadPoolTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/12 12:27
 * @Version 1.0
 **/
public class ThreadPoolTest {

    static class LocalVariable {
        private Long[] a = new Long[1024 * 1024];

        final static ThreadPoolExecutor POOL_EXECUTOR = new ThreadPoolExecutor(5, 5, 1,
                TimeUnit.MINUTES, new LinkedBlockingDeque<>());

        final static ThreadLocal<LocalVariable> localVariable = new ThreadLocal<>();

        public static void main(String[] args) {
            for (int i = 0; i < 50; i++) {
                POOL_EXECUTOR.execute(() -> {
                    localVariable.set(new LocalVariable());
                    System.out.println("use local variable");
                    localVariable.remove();
                });
            }
        }

    }

}
