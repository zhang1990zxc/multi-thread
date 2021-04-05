package com.zhang.design.section04;

/**
 * @ClassName InternalPaymentFactory
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:23
 * @Version 1.0
 **/
public class ForeignPaymentFactory implements PaymentFactory {
    @Override
    public Payment selectPaymentMode(String type) {
        if ("apply".equals(type)) {
            return new ApplyPay();
        }
        return null;
    }
}
