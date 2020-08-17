package com.zhang.thread.chapter2.t6;

/**
 * @ClassName Task
 * @Description synchronized方法弊端
 * @Author 天涯
 * @Date 2020/8/16 14:56
 * @Version 1.0
 **/
public class Task {

    private String getData1;

    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
            String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
                System.out.println(getData1);
                System.out.println(getData2);
                System.out.println("end task");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
