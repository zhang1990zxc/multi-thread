package com.zhang.thread.chapter2.twoObjectTwoLock;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/12 13:56
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum num1 = new HasSelfPrivateNum();
        HasSelfPrivateNum num2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(num1);
        threadA.start();

        ThreadB threadB = new ThreadB(num2);
        threadB.start();
    }
}
