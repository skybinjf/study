package com.study.pattern.graphic.structural.proxy.dynamic;

/**
 * 主题角色
 *
 * @author Sky
 * @date 2020-10-10 16:50.
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("This is real doSomething.");
    }
}
