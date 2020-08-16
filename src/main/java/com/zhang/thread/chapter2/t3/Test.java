package com.zhang.thread.chapter2.t3;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/20 20:50
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);
            publicVar.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}


