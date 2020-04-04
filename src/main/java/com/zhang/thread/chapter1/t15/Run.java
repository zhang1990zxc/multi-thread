package com.zhang.thread.chapter1.t15;

/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 11:03
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();

            Thread.sleep(1000);

            Thread thread2 = new Thread(){
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString()方法！只打印1个begin");
                    System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了！");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
