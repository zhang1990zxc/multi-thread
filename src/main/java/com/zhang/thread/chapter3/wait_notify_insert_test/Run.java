package com.zhang.thread.chapter3.wait_notify_insert_test;


/**
 * @ClassName Run
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 0:32
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            BackupA input = new BackupA(dbTools);
            output.start();
            input.start();
        }
    }
}
