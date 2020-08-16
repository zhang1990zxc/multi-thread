package com.zhang.thread.chapter2.throwExceptionNoLock;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:42
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
