package com.zhang.thread.chapter4.conditionTestManyToMany;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 14:49
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();

        MyThreadA[] threadAS = new MyThreadA[10];
        MyThreadB[] threadBS = new MyThreadB[10];

        for (int i = 0; i < 10; i++) {
            threadAS[i] = new MyThreadA(myService);
            threadBS[i] = new MyThreadB(myService);
            threadAS[i].start();
            threadBS[i].start();
        }

    }
}
