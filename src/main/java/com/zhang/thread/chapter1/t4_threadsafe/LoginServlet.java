package com.zhang.thread.chapter1.t4_threadsafe;

/**
 * @ClassName LoginServlet
 * @Description 本类模拟成一个Servlet组件
 * @Author zhang
 * @Date 2020/2/8 16:11
 * @Version 1.0
 **/
public class LoginServlet {

    private static String usernameRef;

    private static String passwordRef;

    synchronized public static void doPost(String username, String password){
        try {
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + usernameRef + " password=" + passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
