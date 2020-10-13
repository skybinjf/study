package com.study.pattern.graphic.structural.proxy.aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Spring AOP 动态代理测试类
 *
 * @author Sky
 * @date 2020-10-12 16:17.
 */
public class SpringAopProxyTest {

    public static void main(String[] args) {
        ISubject proxy = ProxyFactory.getProxy(ISubject.class, new SubjectSpringAopInvoker(new RealSubject()));
        proxy.doAction();
    }
}
