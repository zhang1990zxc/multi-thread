package com.zhang.design.section09;

/**
 * @ClassName Waitress
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/27 1:46
 * @Version 1.0
 **/
public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent menuComponent) {
        this.allMenus = menuComponent;
    }

    public void printMenu() {
        allMenus.print();
    }

}
