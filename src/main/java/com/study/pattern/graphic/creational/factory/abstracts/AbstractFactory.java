package com.study.pattern.graphic.creational.factory.abstracts;

/**
 * 抽象工厂
 *
 * @author Sky
 * @Date 2019-11-29 10:48.
 */
public interface AbstractFactory {

    /**
     * 生产 A 系列产品
     * @return
     */
    AbstractProductA createProductA();

    /**
     * 生产 B 系列产品
     * @return
     */
    AbstractProductB createProductB();

}
