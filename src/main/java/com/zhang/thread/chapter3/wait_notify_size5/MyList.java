package com.zhang.thread.chapter3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyList
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/18 23:19
 * @Version 1.0
 **/
public class MyList {
    private static List<String> list = new ArrayList<>();
    public static void add(){
        list.add("andString");
    }
    public static int size() {
        return list.size();
    }
}
