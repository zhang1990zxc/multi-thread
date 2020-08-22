package com.zhang.thread.chapter3.waitOld;


/**
 * @ClassName Add
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/19 23:48
 * @Version 1.0
 **/
public class Add {

    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }

}
