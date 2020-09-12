package com.zhang.thread.section11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName TestSimpleDateFormat
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/11 0:45
 * @Version 1.0
 **/
public class TestSimpleDateFormat {
    public static final ThreadLocal<DateFormat> SIMPLE_DATE_FORMAT = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    System.out.println(SIMPLE_DATE_FORMAT.get().parse("2020-09-11 00:47:55"));
                } catch (ParseException e) {
                    e.printStackTrace();
                } finally {
                    SIMPLE_DATE_FORMAT.remove();
                }
            });
            thread.start();
        }
    }

}
