package com.study.pattern.graphic.creational.builder;

/**
 * 测试类
 *
 * @author Sky
 * @date 2020-09-16 16:50.
 */
public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.setBuilder(builder);
        Product product = director.buildProduct("我", "你", "他");
        System.out.println(product.toString());
    }

}
