package com.zhang.design.section08;/**
 *@ClassName CaffeineBeverageWithHook
 *@Description 整条街最靓的仔，写点注释吧
 *@Author 天涯
 *@Date 2021/3/26 0:16 
 *@Version 1.0
 **/
public abstract class CaffeineBeverageWithHook {
    
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    void boilWater() {
        System.out.println("Boiling water");
    }
    
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    boolean customerWantsCondiments() {
        return true;
    }

}
