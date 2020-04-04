package com.zhang.thread.chapter2.t2;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/12 14:10
 * @Version 1.0
 **/
public class Test2 {
    public void myMethod(){
        synchronized (this){
            int age = 100;
        }
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myMethod();
    }
}
