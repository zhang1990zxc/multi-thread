package com.zhang.design.section04;

/**
 * @ClassName WeCharPay
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:20
 * @Version 1.0
 **/
public class WeCharPay extends InternalPayment {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
