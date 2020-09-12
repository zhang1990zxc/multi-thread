package com.zhang.thread.section11;

import cn.hutool.json.JSONUtil;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName TestMap
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/11 0:27
 * @Version 1.0
 **/
public class TestMap2 {

    private static ConcurrentHashMap<String, List<String>> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            List<String> list = new CopyOnWriteArrayList<>();
            list.add("device1");
            list.add("device2");
            List<String> oldList = map.putIfAbsent("topic1", list);
            if (oldList != null) {
                oldList.addAll(list);
            }
            System.out.println(JSONUtil.toJsonStr(map));
        });

        Thread thread2 = new Thread(() -> {
            List<String> list = new CopyOnWriteArrayList<>();
            list.add("device11");
            list.add("device22");
            List<String> oldList = map.putIfAbsent("topic1", list);
            if (oldList != null) {
                oldList.addAll(list);
            }
            System.out.println(JSONUtil.toJsonStr(map));
        });

        Thread thread3 = new Thread(() -> {
            List<String> list = new CopyOnWriteArrayList<>();
            list.add("device111");
            list.add("device222");
            List<String> oldList = map.putIfAbsent("topic2", list);
            if (oldList != null) {
                oldList.addAll(list);
            }
            System.out.println(JSONUtil.toJsonStr(map));
        });

        thread.start();
        thread2.start();
        thread3.start();

    }


}
