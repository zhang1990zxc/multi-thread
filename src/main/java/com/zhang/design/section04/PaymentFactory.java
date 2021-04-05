package com.zhang.design.section04;

/**
 * @ClassName PaymentFactory
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:09
 * @Version 1.0
 **/
public interface PaymentFactory {

    Payment selectPaymentMode(String type);

}
