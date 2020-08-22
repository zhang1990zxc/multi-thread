package com.zhang.thread.chapter3.stack_50;

/**
 * @ClassName SetCheckThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:31
 * @Version 1.0
 **/
public class GetCheckThread extends Thread {

    private GetService getService;

    public GetCheckThread(GetService getService) {
        this.getService = getService;
    }

    @Override
    public void run() {
        getService.checkBoxStatus();
    }
}
