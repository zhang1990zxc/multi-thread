package com.zhang.design.section04;

/**
 * @ClassName ApplyPay
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:22
 * @Version 1.0
 **/
public class ApplyPay extends ForeignPayment {
    @Override
    public void pay() {
        System.out.println("苹果支付");
    }
}
