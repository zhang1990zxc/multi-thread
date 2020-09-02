package com.zhang.thread.section01.future;

import java.util.concurrent.Callable;

/**
 * @ClassName CallTask
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/30 13:36
 * @Version 1.0
 **/
public class CallTask implements Callable<String> {
    @Override
    public String call() {
        return "hello";
    }
}
