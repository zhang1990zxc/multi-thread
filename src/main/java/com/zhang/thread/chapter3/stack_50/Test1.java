package com.zhang.thread.chapter3.stack_50;

/**
 * @ClassName Test1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:35
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        SetService setService = new SetService(box);
        for (int i = 0; i < 2; i++) {
            SetValueThread setValueThread = new SetValueThread(setService);
            setValueThread.start();
        }

        Thread.sleep(50);
        SetCheckThread setCheckThread = new SetCheckThread(setService);
        setCheckThread.start();

        Thread.sleep(10000);

        GetService getService = new GetService(box);
        for (int i = 0; i < 10; i++) {
            GetValueThread getValueThread = new GetValueThread(getService);
            getValueThread.start();
        }
        Thread.sleep(50);
        GetCheckThread getCheckThread = new GetCheckThread(getService);
        getCheckThread.start();

    }
}
