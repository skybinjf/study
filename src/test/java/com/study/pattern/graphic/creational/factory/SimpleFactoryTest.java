package com.study.pattern.graphic.creational.factory;

import com.study.pattern.graphic.creational.factory.simple.Product;
import com.study.pattern.graphic.creational.factory.simple.SimpleFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 简单工厂模式测试类
 *
 * @author Sky
 * @date 2019-11-04 09:37.
 */
@SpringBootTest
public class SimpleFactoryTest {

    /**
     * 简单工厂类创建对象测试
     */
    @Test
    public void TestCreateProduct() {
        Product productA1 = SimpleFactory.createProduct("A");
        Product productB1 = SimpleFactory.createProduct("B");
        Product productA2 = SimpleFactory.createProduct("A");
        Product productB2 = SimpleFactory.createProduct("B");

        System.out.println("productA1: " + productA1);
        productA1.user();

        System.out.println("productB1: " + productB1);
        productB1.user();

        System.out.println("productA2: " + productA2);
        productA2.user();

        System.out.println("productB2: " + productB2);
        productB2.user();
    }

}
