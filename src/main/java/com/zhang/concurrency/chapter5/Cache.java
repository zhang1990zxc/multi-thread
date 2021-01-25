package com.zhang.concurrency.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName Cache
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/21 21:45
 * @Version 1.0
 **/
public class Cache {

    private static Map<String, Object> map = new HashMap<>();

    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private static Lock readLock = readWriteLock.readLock();

    private static Lock writerLock = readWriteLock.writeLock();

    public static final Object get(String key) {
        readLock.lock();
        try {
            return map.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public static final Object put(String key, Object value) {
        writerLock.lock();
        try {
            return map.put(key, value);
        } finally {
            writerLock.unlock();
        }
    }

    public static final void clear() {
        writerLock.lock();
        try {
            map.clear();
        } finally {
            writerLock.unlock();
        }
    }

}
