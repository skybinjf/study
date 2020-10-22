package com.study.pattern.graphic.behavioral.strategy.shopping;

/**
 * 返现10元
 *
 * @author Sky
 * @date 2020-10-22 10:04.
 */
public class DiscountCash10 extends Discount {

    public DiscountCash10() {
        super("返现10元");
    }

    @Override
    double discount(double price) {
        finalPrice = price > 10 ? price - 10 : 0;
        return finalPrice;
    }
}
