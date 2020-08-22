package com.zhang.thread.chapter3.stack_50;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Box
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:21
 * @Version 1.0
 **/
public class Box {

    private static List<Object> list = new ArrayList<>();

    synchronized public void add() {
        if (size() < 50) {
            list.add("anyString");
            System.out.println("线程：" + Thread.currentThread().getName() + "执行add()方法，size大小为：" + size());
        }
    }

    synchronized public int size() {
        return list.size();
    }

    synchronized public Object popFirst() {
        Object value = list.remove(0);
        System.out.println("线程：" + Thread.currentThread().getName() + "执行popFirst()方法，size大小为：" + size());
        return value;
    }

}
