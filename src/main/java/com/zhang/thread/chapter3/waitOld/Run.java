package com.zhang.thread.chapter3.waitOld;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/19 23:55
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("threadSubtract1");
        threadSubtract1.start();

        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("threadSubtract2");
        threadSubtract2.start();

        Thread.sleep(1000);

        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("threadAdd");
        threadAdd.start();
    }
}
