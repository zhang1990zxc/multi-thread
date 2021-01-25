package com.zhang.concurrency.chapter4;

/**
 * @ClassName ThreadPool
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/20 1:06
 * @Version 1.0
 **/
public interface ThreadPool<Job extends Runnable> {
    void execute(Job job);
    void shutdown();
    void addWorkers(int num);
    void removeWorkers(int num);
    int getJobSize();
}
