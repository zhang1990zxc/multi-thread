package com.zhang.concurrency.chapter3;

/**
 * @ClassName InstanceFactory
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/17 21:51
 * @Version 1.0
 **/
public class InstanceFactory {

    private static class InstanceHolder {
        public static Instance instance = new Instance();
    }

    public static Instance getInstance() {
        return InstanceHolder.instance;
    }

}
