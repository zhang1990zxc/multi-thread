package com.zhang.thread.chapter2.synchronizedBlockLockAll;

/**
 * @ClassName Run1_1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 23:40
 * @Version 1.0
 **/
public class Run1_1 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject object = new MyObject();

        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();

//        Thread.sleep(100);

        ThreadB b = new ThreadB(object);
        b.setName("b");
        b.start();
    }
}
