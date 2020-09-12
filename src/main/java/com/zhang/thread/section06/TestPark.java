package com.zhang.thread.section06;

import java.util.concurrent.locks.LockSupport;

/**
 * @ClassName TestPark
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/5 18:11
 * @Version 1.0
 **/
public class TestPark {

    public void testPark() {
        LockSupport.park(this);
    }

    public static void main(String[] args) {
        TestPark testPark = new TestPark();
        testPark.testPark();
    }

}
