package com.zhang.thread.chapter3.wait_notify_insert_test;

/**
 * @ClassName BackupA
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/21 0:31
 * @Version 1.0
 **/
public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
