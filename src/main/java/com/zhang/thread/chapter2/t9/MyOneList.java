package com.zhang.thread.chapter2.t9;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyOneList
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/16 23:09
 * @Version 1.0
 **/
public class MyOneList {

    private List list = new ArrayList();

    synchronized public void add(String data) {
        list.add(data);
    }

    synchronized public int getSize() {
        return list.size();
    }

}
