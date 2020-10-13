package com.study.pattern.graphic.creational.builder;

/**
 * 指挥者
 *
 * @author Sky
 * @date 2019-12-04 15:39.
 */
public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构建产品
     * @param a
     * @param b
     * @param c
     * @return
     */
    public Product buildProduct(String a, String b, String c) {
        this.builder.buildPartA(a);
        this.builder.buildPartB(b);
        this.builder.buildPartC(c);
        return builder.getResult();
    }
}
