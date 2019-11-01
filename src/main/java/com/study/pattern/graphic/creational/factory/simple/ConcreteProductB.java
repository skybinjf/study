package com.study.pattern.graphic.creational.factory.simple;

/**
 * 具体产品角色B
 *
 * @author Sky
 * @date 2019-11-01 16:25.
 */
public class ConcreteProductB implements Product {
    @Override
    public void user() {
        System.out.println("I'm ConcreteProductB...");
    }
}
