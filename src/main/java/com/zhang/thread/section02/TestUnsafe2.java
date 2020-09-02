package com.zhang.thread.section02;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @ClassName TestUnsafe
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/3 0:44
 * @Version 1.0
 **/
public class TestUnsafe2 {

    private static Unsafe unsafe;

    public static long stateOffset;

    private volatile long state = 0;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
            stateOffset = unsafe.objectFieldOffset(TestUnsafe2.class.getDeclaredField("state"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestUnsafe2 testUnsafe = new TestUnsafe2();
        boolean success = unsafe.compareAndSwapInt(testUnsafe, stateOffset, 0, 1);
        System.out.println(success);
    }
}
