package com.study.pattern.graphic.structural.proxy.aop;

/**
 * 业务实现类
 *
 * @author Sky
 * @date 2020-10-12 16:11.
 */
public class RealSubject implements ISubject {
    @Override
    public void doAction() {
        System.out.println("Real Action Here!");
    }
}
