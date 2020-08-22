package com.zhang.thread.chapter3.inheritable;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/23 3:23
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Userinfo userinfo = new Userinfo();
        System.out.println("A userinfo " + userinfo.hashCode());
        userinfo.setUsername("中国");
        if (Tools.t1.get() == null) {
            Tools.t1.set(userinfo);
        }
        System.out.println("在main县城中取值=" + Tools.t1.get().getUsername() + " " + userinfo.hashCode());
        Thread.sleep(100);
        ThreadA a = new ThreadA();
        a.start();
        Thread.sleep(5000);
        Tools.t1.get().setUsername("美国");
    }

}
