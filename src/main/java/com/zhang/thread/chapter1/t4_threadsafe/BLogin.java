package com.zhang.thread.chapter1.t4_threadsafe;

/**
 * @ClassName BLogin
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 16:42
 * @Version 1.0
 **/
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
