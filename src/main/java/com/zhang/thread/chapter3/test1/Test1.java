package com.zhang.thread.chapter3.test1;

/**
 * @ClassName Test1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 22:53
 * @Version 1.0
 **/
public class Test1 {
    public static void main(String[] args) {

        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下面的代码");
            }
            System.out.println("syn下面的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
