package com.study.pattern.graphic.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试类
 * 真实对象，委托代理对象做某些事情
 *
 * @author Sky
 * @date 2020-10-10 16:55.
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        // 委托类
        Subject realSubject = new RealSubject();
        // 委托类 classLoader
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        // 委托类对应的ProxyHandler
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(realSubject);
        Class[] classes = new Class[]{Subject.class};
        // 代理类
        Subject proxySubject = (Subject) Proxy.newProxyInstance(classLoader, classes, dynamicProxyHandler);
        // 代理类调用方法
        proxySubject.doSomething();

    }

}
