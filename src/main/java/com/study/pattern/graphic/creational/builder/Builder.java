package com.study.pattern.graphic.creational.builder;

/**
 * 抽象建造者
 *
 * @author Sky
 * @Date 2019-12-04 19:19.
 */
public interface Builder {

    void buildPartA(String a);
    void buildPartB(String b);
    void buildPartC(String c);

    Product getResult();
}
