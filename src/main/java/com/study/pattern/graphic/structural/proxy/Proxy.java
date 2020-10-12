package com.study.pattern.graphic.structural.proxy;

/**
 * 代理主题角色
 *
 * @author Sky
 * @date 2020-10-10 11:08.
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy() {
        this.subject = new RealSubject();
    }

    /**
     * 调用代理方法后
     */
    private void afterRequest() {
        System.out.println("afterRequest……");
    }

    /**
     * 调用代理方法前
     */
    private void preRequest() {
        System.out.println("preRequest……");
    }

    @Override
    public void request() {
        System.out.println("代理对象开始工作……");

        preRequest();
        subject.request();
        afterRequest();
    }
}
