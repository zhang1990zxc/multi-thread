package com.zhang.design.section04;

/**
 * @ClassName InternalPaymentFactory
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:23
 * @Version 1.0
 **/
public class InternalPaymentFactory implements PaymentFactory {
    @Override
    public Payment selectPaymentMode(String type) {
        if ("ali".equals(type)) {
            return new AliPay();
        } else if("wechar".equals(type)) {
            return new WeCharPay();
        } else if ("yl".equals(type)) {
            return new YLPay();
        }
        return null;
    }
}
