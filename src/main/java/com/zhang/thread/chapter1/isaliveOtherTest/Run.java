package com.zhang.thread.chapter1.isaliveOtherTest;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/9 1:50
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread t1 = new Thread(countOperate);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive="+t1.isAlive());
    }
}
