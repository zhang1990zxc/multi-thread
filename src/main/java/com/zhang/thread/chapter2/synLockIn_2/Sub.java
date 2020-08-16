package com.zhang.thread.chapter2.synLockIn_2;

/**
 * @ClassName Sub
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:25
 * @Version 1.0
 **/
public class Sub extends Main {

    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
