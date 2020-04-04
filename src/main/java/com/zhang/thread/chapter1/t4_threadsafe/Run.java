package com.zhang.thread.chapter1.t4_threadsafe;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 16:43
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }

}
