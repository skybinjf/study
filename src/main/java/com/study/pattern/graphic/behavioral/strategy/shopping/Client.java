package com.study.pattern.graphic.behavioral.strategy.shopping;

/**
 * 客户端测试类
 *
 * @author Sky
 * @date 2020-10-22 10:17.
 */
public class Client {

    public static void main(String[] args) {
        Shopping shopping1 = new Shopping("书籍-设计模式", 54.00, new DiscountDis9());
        shopping1.calculate();

        Shopping shopping2 = new Shopping("Apple Watch", 3200.00, new DiscountDis8());
        shopping2.calculate();

        Shopping shopping3 = new Shopping("iphone12 mini", 6499.00, new DiscountNone());
        shopping3.calculate();

        Shopping shopping4 = new Shopping("鼠标垫", 8.00, new DiscountCash10());
        shopping4.calculate();
    }
}
