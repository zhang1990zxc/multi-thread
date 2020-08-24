package com.zhang.thread.chapter4.useConditionWaitNotifyOK;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @ClassName Test3
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 14:31
 * @Version 1.0
 **/
public class Test3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        System.out.println("begin " + System.currentTimeMillis());
        unsafe.park(false, 0);
        System.out.println("  end " + System.currentTimeMillis());
    }
}
