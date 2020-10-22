package com.study.pattern.graphic.behavioral.strategy.shopping;

import java.text.MessageFormat;

/**
 * 环境类 Shopping，维护了一个 Discount 引用
 *
 * @author Sky
 * @date 2020-10-22 10:11.
 */
public class Shopping {

    private String goods;
    private double price;
    private Discount discount;

    public Shopping(String goods, double price, Discount discount) {
        this.goods = goods;
        this.price = price;
        this.discount = discount;
    }

    public double calculate() {
        double finalPrice = discount.discount(price);
        String desc = discount.getDesc();
        String s = MessageFormat.format("购买的物品：{0}，原始价格：{1}，{2}，最终价格为：{3}", goods, price, desc, finalPrice);
        System.out.println(s);
        return finalPrice;
    }
}
