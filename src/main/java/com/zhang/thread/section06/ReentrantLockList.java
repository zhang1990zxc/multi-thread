package com.zhang.thread.section06;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReentrantLock
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/6 1:32
 * @Version 1.0
 **/
public class ReentrantLockList {

    private ArrayList<String> arrayList = new ArrayList<>();

    private volatile ReentrantLock lock = new ReentrantLock();

    public void add(String e) {
        lock.lock();
        try {
            arrayList.add(e);
        } finally {
            lock.unlock();
        }
    }

    public void remove(String e) {
        lock.lock();
        try {
            arrayList.remove(e);
        } finally {
            lock.unlock();
        }
    }

    public String get(int index) {
        lock.lock();
        try {
            return arrayList.get(index);
        } finally {
            lock.unlock();
        }
    }

}
