package com.zhang.thread.chapter1.t4_threadsafe;

/**
 * @ClassName ALogin
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 16:41
 * @Version 1.0
 **/
public class ALogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
