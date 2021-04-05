package com.zhang.design.section04;

/**
 * @ClassName YLPay
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:21
 * @Version 1.0
 **/
public class YLPay extends InternalPayment {
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
