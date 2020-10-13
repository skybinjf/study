package com.study.pattern.graphic.structural.adapter;

/**
 * 适配者测试类
 *
 * @author Sky
 * @date 2020-09-17 15:53.
 */
public class AdapterTest {

    public static void main(String[] args) {
        // 类适配器模式
        Target target = new Adapter();
        target.request();

        // 对象适配器模式
        Adaptee adaptee = new Adaptee();
        Target target2 = new Adapter2(adaptee);
        target2.request();
    }

}
