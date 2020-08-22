package com.zhang.thread.chapter3.inheritable;

/**
 * @ClassName ThreadA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 3:21
 * @Version 1.0
 **/
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Userinfo userinfo = Tools.t1.get();
                System.out.println("在ThreadA线程中取值=" + userinfo.getUsername() + " " + userinfo.hashCode());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
