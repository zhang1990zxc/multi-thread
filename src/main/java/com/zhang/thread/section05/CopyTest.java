package com.zhang.thread.section05;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName CopyTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/4 23:56
 * @Version 1.0
 **/
public class CopyTest {

    private static volatile CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        arrayList.add("hello");
        arrayList.add("alibaba");
        arrayList.add("welcome");
        arrayList.add("to");
        arrayList.add("hangzhou");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                arrayList.set(1, "baba");
                arrayList.remove(2);
                arrayList.remove(3);
            }
        });

        Iterator<String> iterator = arrayList.iterator();

        thread.start();

        thread.join();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
