package com.zhang.thread.chapter1.daemonThread;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 14:36
 * @Version 1.0
 **/
public class MyThread extends Thread {
    private int i;
    @Override
    public void run() {
        try {
            while(true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
