package com.zhang.thread.chapter1.t13;

/**
 * @ClassName MyThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/9 14:50
 * @Version 1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (Thread.interrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我被输出，如果此代码是for又继续运行，线程未停止！");
        } catch (InterruptedException e){
            System.out.println("进入MyThread.java类run方法中catch了！");
            e.printStackTrace();
        }


    }
}
