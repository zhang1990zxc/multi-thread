package com.zhang.thread.chapter4.lockInterruptibly;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 19:13
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();

        Thread.sleep(500);

        ThreadA b = new ThreadA(service);
        b.setName("b");
        b.start();

        Thread.sleep(500);

        b.interrupt();

        System.out.println("main中断b，但并没有成功！");
    }
}
