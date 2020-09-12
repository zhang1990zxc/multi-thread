package com.zhang.thread.section03;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName RandomTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/4 0:19
 * @Version 1.0
 **/
public class RandomTest {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(5));
        }
    }
}
