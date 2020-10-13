package com.study.pattern.graphic.creational.factory.simple;

/**
 * 简单工厂模式
 * 工厂角色负责实现创建所有实例的内部逻辑
 *
 * @author Sky
 * @date 2019-11-01 16:22.
 */
public class SimpleFactory {
    private final static String CONCRETE_PRODUCT_A = "A";
    private final static String CONCRETE_PRODUCT_B = "B";

    /**
     * 根据产品名称创建产品对象
     * @param productName
     * @return
     */
    public static Product createProduct(String productName) {
        if (CONCRETE_PRODUCT_A.equals(productName)) {
            return new ConcreteProductA();
        } else if (CONCRETE_PRODUCT_B.equals(productName)) {
            return new ConcreteProductB();
        } else {
            return null;
        }
    }
}
