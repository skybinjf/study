package com.study.pattern.graphic.behavioral.strategy.shopping;

/**
 * 不参与优惠活动
 *
 * @author Sky
 * @date 2020-10-22 10:07.
 */
public class DiscountNone extends Discount {

    public DiscountNone() {
        super("不参与优惠活动");
    }

    @Override
    double discount(double price) {
        finalPrice = price;
        return finalPrice;
    }
}
