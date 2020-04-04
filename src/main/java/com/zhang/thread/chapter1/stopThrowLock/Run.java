package com.zhang.thread.chapter1.stopThrowLock;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:12
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            MyService object = new MyService();
            MyThreadA threadA = new MyThreadA(object);
            threadA.start();
            MyThreadB threadB = new MyThreadB(object);
            threadB.start();
            Thread.sleep(3000);
            threadA.stop();
            System.out.println("stop()执行后，在下方开始打印username和password。");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
