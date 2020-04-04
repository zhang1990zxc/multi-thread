package com.zhang.thread.chapter1.t14;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:47
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            thread.suspend();
            System.out.println("A= "+System.currentTimeMillis()+" i="+thread.getI());
            Thread.sleep(5000);
            System.out.println("A= "+System.currentTimeMillis()+" i="+thread.getI());
            thread.resume();
            Thread.sleep(5000);

            thread.suspend();
            System.out.println("B= "+System.currentTimeMillis()+" i="+thread.getI());
            Thread.sleep(5000);
            System.out.println("B= "+System.currentTimeMillis()+" i="+thread.getI());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
