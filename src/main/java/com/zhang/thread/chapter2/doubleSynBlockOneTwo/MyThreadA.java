package com.zhang.thread.chapter2.doubleSynBlockOneTwo;


/**
 * @ClassName MyThread1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 15:02
 * @Version 1.0
 **/
public class MyThreadA extends Thread {

    private ObjectService service;

    public MyThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA();
    }
}
