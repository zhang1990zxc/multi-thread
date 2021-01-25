package com.zhang.concurrency.chapter4;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName SleepUtils
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/18 0:25
 * @Version 1.0
 **/
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
