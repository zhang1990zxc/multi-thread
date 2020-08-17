package com.zhang.thread.chapter2.t9;

/**
 * @ClassName MyThread1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 23:11
 * @Version 1.0
 **/
public class MyThread2 extends Thread {

    private MyOneList list;

    public MyThread2(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.addServiceMethod(list, "B");
    }
}
