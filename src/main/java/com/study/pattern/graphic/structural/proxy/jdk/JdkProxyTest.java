package com.study.pattern.graphic.structural.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * JDK 动态代理测试类
 *
 * @author Sky
 * @date 2020-10-12 15:34.
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        ISubject subject = (ISubject) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class<?>[]{ISubject.class}, new SubjectJdkProxyHandler(new RealSubject()));
        subject.doAction();
        System.out.println("-------------------------");

        // 使用同一个SubjectProxyHandler类，可代理不同的类型
        ISubject subject2 = (ISubject) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                RealSubject2.class.getInterfaces(), new SubjectJdkProxyHandler(new RealSubject2()));
        subject2.doAction();
    }

}
