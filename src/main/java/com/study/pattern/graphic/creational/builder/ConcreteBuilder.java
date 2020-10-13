package com.study.pattern.graphic.creational.builder;

/**
 * 具体建造者
 *
 * @author Sky
 * @date 2019-12-04 19:20.
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPartA(String a) {
        product.setA(a);
    }

    @Override
    public void buildPartB(String b) {
        product.setB(b);
    }

    @Override
    public void buildPartC(String c) {
        product.setC(c);
    }

    @Override
    public Product getResult() {
        return product;
    }
}
