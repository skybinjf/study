package com.study.pattern.graphic.creational.factory.abstracts;

/**
 * 具体产品，等级结构是 1 的产品 A
 *
 * @author Sky
 * @date 2019-11-29 10:56.
 */
public class ConcreteProductA1 implements AbstractProductA {
    @Override
    public void use() {
        System.out.println("ConcreteProductA1 use...");
    }
}
