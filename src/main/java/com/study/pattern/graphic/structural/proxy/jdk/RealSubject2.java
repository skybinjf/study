package com.study.pattern.graphic.structural.proxy.jdk;

/**
 * 业务实现类
 *
 * @author Sky
 * @date 2020-10-12 15:29.
 */
public class RealSubject2 implements ISubject {

    @Override
    public void doAction() {
        System.out.println("Real Action2 Here!");
    }
}
