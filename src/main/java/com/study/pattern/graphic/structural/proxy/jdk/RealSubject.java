package com.study.pattern.graphic.structural.proxy.jdk;

/**
 * 业务实现类
 *
 * @author Sky
 * @date 2020-10-12 15:19.
 */
public class RealSubject implements ISubject {

    @Override
    public void doAction() {
        System.out.println("Real Action Here!");
    }
}
