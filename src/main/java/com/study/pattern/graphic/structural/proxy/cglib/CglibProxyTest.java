package com.study.pattern.graphic.structural.proxy.cglib;

import com.study.pattern.graphic.structural.proxy.jdk.SubjectJdkProxyHandler;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Cglib 动态代理测试类
 *
 * @author Sky
 * @date 2020-10-12 15:55.
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        RealSubject subject = (RealSubject) new SubjectMethodInterceptor().createCglibProxy(RealSubject.class);
        subject.doAction();
        System.out.println("---------------------");

        // 使用 Cglib + JDK
        RealSubject subject1 = (RealSubject) createCglibProxyWithHandler(RealSubject.class);
        subject1.doAction();
    }

    /**
     *  还可使用 CGLib + JDK InvocationHandler 接口实现动态代理
     * @param targetClass
     * @return
     */
    public static Object createCglibProxyWithHandler(Class<?> targetClass) {
        MethodInterceptor interceptor = null;
        try {
            InvocationHandler invocationHandler = new SubjectJdkProxyHandler(targetClass.newInstance());
            interceptor = (Object o, Method method, Object[] objects,
                           MethodProxy methodProxy) -> invocationHandler.invoke(o, method, objects);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return Enhancer.create(targetClass, interceptor);
    }
}
