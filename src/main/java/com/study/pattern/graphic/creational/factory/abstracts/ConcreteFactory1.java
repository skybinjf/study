package com.study.pattern.graphic.creational.factory.abstracts;

/**
 * 具体工厂1，生产等级结构是 1 的产品（包括 A 产品和 B 产品）
 *
 * @author Sky
 * @date 2019-11-29 10:52.
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
