package com.zhang.thread.chapter2.t2;

/**
 * @ClassName HasSelfPrivateNum
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/12 13:53
 * @Version 1.0
 **/
public class HasSelfPrivateNum {
    private int num = 0;

    synchronized public void addNum(String username){
        try {
            if(username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username+" num="+num);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
