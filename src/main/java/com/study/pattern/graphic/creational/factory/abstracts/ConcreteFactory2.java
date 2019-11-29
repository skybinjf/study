package com.study.pattern.graphic.creational.factory.abstracts;

/**
 * 具体工厂2，生产等级结构是 2 的产品（包括 A 产品和 B 产品）
 *
 * @author Sky
 * @date 2019-11-29 10:55.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return null;
    }

    @Override
    public AbstractProductB createProductB() {
        return null;
    }
}
