package com.study.pattern.graphic.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 动态代理
 *
 * @author Sky
 * @date 2020-10-10 16:52.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object target;

    public DynamicProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    /**
     * 调用invoke方法之前执行
     */
    private void before() {
        System.out.println(String.format("代理方法 start time [%s] ", new Date()));
    }

    /**
     * 调用invoke方法之后执行
     */
    private void after() {
        System.out.println(String.format("代理方法 end time [%s] ", new Date()));
    }

}
