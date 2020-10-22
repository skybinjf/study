package com.study.pattern.graphic.behavioral.strategy.shopping;

/**
 * 抽象策略类 Discount
 *
 * @author Sky
 * @date 2020-10-22 10:00.
 */
public abstract class Discount {
    protected double finalPrice;
    protected String desc;

    public Discount(String desc) {
        this.desc = desc;
    }

    abstract double discount(double price);

    public String getDesc() {
        return desc;
    }
}
