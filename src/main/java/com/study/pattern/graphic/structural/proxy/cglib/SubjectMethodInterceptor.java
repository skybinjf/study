package com.study.pattern.graphic.structural.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 动态代理类(实现方法拦截器接口)
 * MethodInterceptor 接口来自 net.sf.cglib.proxy.MethodInterceptor 或 org.springframework.cglib.proxy.MethodInterceptor
 *
 * @author Sky
 * @date 2020-10-12 15:48.
 */
public class SubjectMethodInterceptor implements MethodInterceptor {

    public Object createCglibProxy(Class<?> targetClass) {
        // 创建增强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        // 为增强器指定要代理的业务类，即为生成的代理类指定父类
        enhancer.setSuperclass(targetClass);
        // 设置回调(对于代理类上所有方法的调用，都会调用 CallBack)
        enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();

        // 以上语句可简化为
        //return Enhancer.create(targetClass, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 扩展进行额外的功能操作(如鉴权、计时、日志等)
        System.out.println(">> doWhatever start");
        Object result = methodProxy.invokeSuper(o, objects);
        // 扩展进行额外的功能操作(如鉴权、计时、日志等)
        System.out.println("doWhatever end <<");

        return result;
    }
}
