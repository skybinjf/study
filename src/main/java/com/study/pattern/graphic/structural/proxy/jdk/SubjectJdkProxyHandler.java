package com.study.pattern.graphic.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK 动态代理类
 *
 * @author Sky
 * @date 2020-10-12 15:30.
 */
public class SubjectJdkProxyHandler implements InvocationHandler {

    private Object object;

    public SubjectJdkProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 扩展进行额外的功能操作(如鉴权、计时、日志等)
        System.out.println(">> doWhatever start");
        // 执行目标对象方法
        Object result = method.invoke(object, args);
        // 扩展进行额外的功能操作(如鉴权、计时、日志等)
        System.out.println("doWhatever end <<");
        return result;
    }
}
