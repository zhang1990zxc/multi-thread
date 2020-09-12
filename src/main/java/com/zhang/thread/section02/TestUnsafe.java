package com.zhang.thread.section02;

import sun.misc.Unsafe;

/**
 * @ClassName TestUnsafe
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/3 0:44
 * @Version 1.0
 **/
public class TestUnsafe {

    private final static Unsafe unsafe = Unsafe.getUnsafe();

    public static long stateOffset;

    private volatile long state = 0;

    static {
        try {
            stateOffset = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestUnsafe testUnsafe = new TestUnsafe();
        boolean success = unsafe.compareAndSwapInt(testUnsafe, stateOffset, 0, 1);
        System.out.println(success);
    }
}
