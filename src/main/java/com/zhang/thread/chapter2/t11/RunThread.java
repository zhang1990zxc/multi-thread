package com.zhang.thread.chapter2.t11;

/**
 * @ClassName RunThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/17 23:43
 * @Version 1.0
 **/
public class RunThread extends Thread {

    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning) {}
        System.out.println("线程被停止了！");
    }
}
