package com.zhang.design.section04;

/**
 * @ClassName Test
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/17 1:30
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        PaymentFactory factory = new InternalPaymentFactory();
        Payment payment = factory.selectPaymentMode("ali");
        payment.pay();
    }
}
