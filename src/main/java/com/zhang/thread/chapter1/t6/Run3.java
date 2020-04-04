package com.zhang.thread.chapter1.t6;

/**
 * @ClassName Run3
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/8 17:43
 * @Version 1.0
 **/
public class Run3 {

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        //countOperate.setName("B");
        Thread t1 = new Thread(countOperate);
        t1.setName("A");
        t1.start();
    }

}
