package com.zhang.thread.chapter3.wait_notify_insert_test;

/**
 * @ClassName DBTools
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 0:28
 * @Version 1.0
 **/
public class DBTools {

    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("*******************");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (!prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("&&&&&&&&&&&&&&&&&&&");
            }
            prevIsA = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
