package com.zhang.thread.chapter1.t1andt3;

/**
 * @ClassName Run3
 * @Description 测试类
 * @Author zhang
 * @Date 2020/2/8 15:03
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(500000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

}
