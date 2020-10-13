package com.study.pattern.graphic.creational.factory.abstracts;

/**
 * 具体产品，等级结构是 2 的产品 A
 *
 * @author Sky
 * @date 2019-12-04 08:51.
 */
public class ConcreteProductA2 implements AbstractProductA {
    @Override
    public void use() {
        System.out.println("ConcreteProductA2 use...");
    }
}
