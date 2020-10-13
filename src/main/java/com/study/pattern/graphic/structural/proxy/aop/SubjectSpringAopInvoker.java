package com.study.pattern.graphic.structural.proxy.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Spring AOP 动态代理
 * 来自 org.aopalliance.intercept.MethodInterceptor
 *
 * @author Sky
 * @date 2020-10-12 16:12.
 */
public class SubjectSpringAopInvoker implements MethodInterceptor {
    private ISubject subject;

    public SubjectSpringAopInvoker(ISubject subject) {
        this.subject = subject;
    }


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // 扩展进行额外的功能操作(如鉴权、计时、日志等)
        System.out.println(">> doWhatever start");
        Object result = methodInvocation.getMethod().invoke(this.subject, methodInvocation.getArguments());
        System.out.println(">> doWhatever start");
        return result;
    }
}
