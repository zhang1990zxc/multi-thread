package com.zhang.thread.chapter3.stack_50;

/**
 * @ClassName SetService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:25
 * @Version 1.0
 **/
public class GetService {

    private Box box;

    public GetService(Box box) {
        this.box = box;
    }

    public void getMethod() {
        try {
            synchronized (this) {
                while (box.size() == 0) {
                    System.out.println("○○○○○○○○○○○○○○○○○○○○○○○○○○");
                    this.wait();
                }
                box.popFirst();
            }
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkBoxStatus() {
        try {
            while (true) {
                synchronized (this) {
                    if (box.size() > 0) {
                        this.notifyAll();
                    }
                }
                System.out.println("get checkBox = " + box.size());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
