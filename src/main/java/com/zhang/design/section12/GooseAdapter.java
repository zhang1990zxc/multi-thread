package com.zhang.design.section12;

/**
 * @ClassName GooseAdapter
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/5 15:42
 * @Version 1.0
 **/
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
