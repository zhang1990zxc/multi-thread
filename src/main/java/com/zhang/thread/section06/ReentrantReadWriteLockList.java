package com.zhang.thread.section06;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName ReentrantLock
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/6 1:32
 * @Version 1.0
 **/
public class ReentrantReadWriteLockList {

    private ArrayList<String> arrayList = new ArrayList<>();

    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();

    public void add(String e) {
        writeLock.lock();
        try {
            arrayList.add(e);
        } finally {
            writeLock.unlock();
        }
    }

    public void remove(String e) {
        writeLock.lock();
        try {
            arrayList.remove(e);
        } finally {
            writeLock.unlock();
        }
    }

    public String get(int index) {
        readLock.lock();
        try {
            return arrayList.get(index);
        } finally {
            readLock.unlock();
        }
    }

}
