package com.study.pattern.graphic.structural.proxy;

/**
 * 真实主题角色
 *
 * @author Sky
 * @date 2020-10-10 11:11.
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实对象……");
    }
}
