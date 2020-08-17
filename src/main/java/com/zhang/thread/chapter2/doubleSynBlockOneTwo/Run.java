package com.zhang.thread.chapter2.doubleSynBlockOneTwo;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 17:11
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();

        MyThreadA a = new MyThreadA(service);
        a.setName("a");
        a.start();

        MyThreadB b = new MyThreadB(service);
        b.setName("b");
        b.start();
    }

}
