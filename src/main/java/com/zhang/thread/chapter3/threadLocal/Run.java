package com.zhang.thread.chapter3.threadLocal;

/**
 * @ClassName threadLocal
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/22 2:24
 * @Version 1.0
 **/
public class Run {

    private static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if(threadLocal.get() == null){
            System.out.println("从未放过值");
            threadLocal.set("我的值");
        }
        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());
    }
}
