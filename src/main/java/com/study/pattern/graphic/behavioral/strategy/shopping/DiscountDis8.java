package com.study.pattern.graphic.behavioral.strategy.shopping;

/**
 * 打八折
 *
 * @author Sky
 * @date 2020-10-22 10:03.
 */
public class DiscountDis8 extends Discount {

    public DiscountDis8() {
        super("打八折");
    }

    @Override
    double discount(double price) {
        finalPrice = price * 0.8;
        return finalPrice;
    }
}
