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
        /* 工厂生成系列1 的 A 和 B 产品 */
        AbstractFactory abstractFactory1 = new ConcreteFactory1();
        AbstractProductA abstractProductA1 = abstractFactory1.createProductA();
        AbstractProductB abstractProductB1 = abstractFactory1.createProductB();
        abstractProductA1.use();
        abstractProductB1.eat();

        /* 工厂生成系列2 的 A 和 B 产品 */
        AbstractFactory abstractFactory2 = new ConcreteFactory2();
        AbstractProductA abstractProductA2 = abstractFactory2.createProductA();
        AbstractProductB abstractProductB2 = abstractFactory2.createProductB();
        abstractProductA2.use();
        abstractProductB2.eat();
    }

}
