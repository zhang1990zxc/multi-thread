package com.zhang.thread.chapter6.dcl_and_volatile;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName Test1
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/25 1:18
 * @Version 1.0
 **/
public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        for(;;) {
            CountDownLatch latch = new CountDownLatch(1);
            CountDownLatch end = new CountDownLatch(100);
            for (int i = 0; i < 100; i++) {
                Thread t1 = new Thread(() -> {
                    try {
                        latch.await();
                        OneInstanceService one = OneInstanceService.getInstance();
                        if (one.i_am_has_state == 0) {
                            System.out.println("one.i_am_has_state == 0进程结束");
                            System.exit(0);
                        }
                        end.countDown();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                t1.start();
            }
            latch.countDown();
            end.await();
            OneInstanceService.reset();
        }
    }

}
