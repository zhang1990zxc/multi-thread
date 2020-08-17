package com.zhang.thread.chapter2.t99;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/17 23:27
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它！stopMethod=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
