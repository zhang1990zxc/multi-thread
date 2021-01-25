package com.zhang.concurrency.chapter8;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ExchangeTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/1/25 0:45
 * @Version 1.0
 **/
public class ExchangeTest {

    public static final Exchanger<String> STRING_EXCHANGER = new Exchanger<>();

    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String a = "银行流水A";
                try {
                    STRING_EXCHANGER.exchange(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String b = "银行流水B";
                try {
                    String a = STRING_EXCHANGER.exchange(b);
                    System.out.println("A和B数据是否一致：" + a.equals(b) + "，A录入的是：" + a + "，B录入是：" + b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.shutdown();
    }

}
