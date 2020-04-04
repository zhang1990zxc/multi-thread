package com.zhang.thread.chapter1.useReturnInterrupt;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:21
 * @Version 1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        while(true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }
}
