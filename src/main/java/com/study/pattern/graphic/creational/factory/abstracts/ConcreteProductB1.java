package com.study.pattern.graphic.creational.factory.abstracts;

/**
 * 具体产品，等级结构是 1 的产品 B
 *
 * @author Sky
 * @date 2019-12-04 08:52.
 */
public class ConcreteProductB1 implements AbstractProductB {
    @Override
    public void eat() {
        System.out.println("ConcreteProductB1 eat...");
    }
}
