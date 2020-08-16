package com.zhang.thread.chapter2.t3;

/**
 * @ClassName PublicVar
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/4/20 20:41
 * @Version 1.0
 **/
public class PublicVar {

    private String username = "A";

    private String password = "AA";

    synchronized public void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;

            System.out.println("setValue method thread name=" + Thread.currentThread().getName()
                    + " username=" + username + " password=" + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void getValue() {
        System.out.println("getValue method thread name=" + Thread.currentThread().getName() +
                " username=" + username + " password=" + password);
    }

}
