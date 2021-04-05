package com.zhang.design.section04;

/**
 * @ClassName AliPay
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:19
 * @Version 1.0
 **/
public class AliPay extends InternalPayment {
    @Override
    public void pay() {
        System.out.println("阿里支付");
    }
}
