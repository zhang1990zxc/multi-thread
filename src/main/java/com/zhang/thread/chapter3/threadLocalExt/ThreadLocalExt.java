package com.zhang.thread.chapter3.threadLocalExt;

import java.util.Date;

/**
 * @ClassName ThreadLocalExt
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 3:31
 * @Version 1.0
 **/
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
//        return "我是默认值 第一次get不在为null";
        return new Date().getTime();
    }
}
