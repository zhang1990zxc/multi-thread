package com.zhang.thread.chapter3.stack_50;

/**
 * @ClassName SetValueThread
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/20 23:30
 * @Version 1.0
 **/
public class GetValueThread extends Thread {

    private GetService getService;

    public GetValueThread(GetService getService) {
        this.getService = getService;
    }

    @Override
    public void run() {
        while (true) {
            getService.getMethod();
        }
    }
}
