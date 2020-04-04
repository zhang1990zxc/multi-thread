package com.zhang.thread.chapter1.stopThrowLock;

/**
 * @ClassName MyService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author zhang
 * @Date 2020/2/11 10:07
 * @Version 1.0
 **/
public class MyService {

    private String username = "a";

    private String password = "aa";

    synchronized public String getUsername() {
        return username;
    }

    synchronized public String getPassword() {
        return password;
    }

    synchronized public void printString(String username, String password){
        try {
            this.username = username;
            Thread.sleep(1000000000);
            this.password = password;
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
