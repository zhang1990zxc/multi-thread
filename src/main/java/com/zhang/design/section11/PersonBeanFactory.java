package com.zhang.design.section11;

import java.lang.reflect.Proxy;

/**
 * @ClassName PersonBeanFactory
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/5 14:05
 * @Version 1.0
 **/
public class PersonBeanFactory {

    public static PersonBean getOwnerProxy(PersonBean bean) {
        return (PersonBean) Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new OwnerInvocationHandler(bean));
    }

    public static PersonBean getNonProxy(PersonBean bean) {
        return (PersonBean) Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new NonInvocationHandler(bean));
    }

}
