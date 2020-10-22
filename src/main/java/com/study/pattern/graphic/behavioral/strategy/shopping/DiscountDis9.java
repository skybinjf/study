package com.study.pattern.graphic.behavioral.strategy.shopping;

/**
 * 打九折
 *
 * @author Sky
 * @date 2020-10-22 10:02.
 */
public class DiscountDis9 extends Discount {

    public DiscountDis9() {
        super("打九折");
    }

    @Override
    double discount(double price) {
        finalPrice = price * 0.9;
        return finalPrice;
    }
}
