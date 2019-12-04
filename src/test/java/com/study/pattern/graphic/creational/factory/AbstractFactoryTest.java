package com.study.pattern.graphic.creational.factory;

import com.study.pattern.graphic.creational.factory.abstracts.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 抽象工厂测试类
 *
 * @author Sky
 * @date 2019-12-04 08:58.
 */
@SpringBootTest
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {
        AbstractFactory abstractFactory1 = new ConcreteFactory1();
        AbstractFactory abstractFactory2 = new ConcreteFactory2();

        AbstractProductA abstractProductA1 = abstractFactory1.createProductA();
        AbstractProductB abstractProductB1 = abstractFactory1.createProductB();

        AbstractProductA abstractProductA2 = abstractFactory2.createProductA();
        AbstractProductB abstractProductB2 = abstractFactory2.createProductB();

        abstractProductA1.use();
        abstractProductB1.eat();
        abstractProductA2.use();
        abstractProductB2.eat();
    }

}
