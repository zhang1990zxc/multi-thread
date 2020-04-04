package com.zhang.thread.chapter1.t14;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:44
 * @Version 1.0
 **/
public class MyThread extends Thread {

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while(true){
            i++;
        }
    }
}
