package com.zhang.design.section03;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/21 13:22
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Product product = Product.builder().name("苹果手机12").no("ip12").price(7600D).builder();
        System.out.println(product);
    }

}
