package com.zhang.thread.chapter2.synNotExtends;

/**
 * @ClassName Main
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/22 15:51
 * @Version 1.0
 **/
public class Main {

    synchronized public void serviceMethod() {
        try {
            System.out.println("int main 下一步sleep begin threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步sleep end threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
