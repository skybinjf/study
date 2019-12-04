package com.study.pattern.graphic.creational.factory.abstracts;

/**
 * 具体产品，等级结构是 2 的产品 B
 *
 * @author Sky
 * @date 2019-12-04 08:52.
 */
public class ConcreteProductB2 implements AbstractProductB {
    @Override
    public void eat() {
        System.out.println("ConcreteProductB2 eat...");
    }
}
