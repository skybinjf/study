package com.study.pattern.graphic.structural.adapter.charger;

/**
 * 测试充电器适配器类
 *
 * @author Sky
 * @date 2020-09-28 14:03.
 */
public class TestAdapter {

    public static void main(String[] args) {
        // 使用正常的苹果充电器给 iphone 8 手机充电
        Iphone8 iphone8 = new Iphone8(new AppleCharger());
        iphone8.charge();
        System.out.println("==============================");

        // 使用正常的安卓充电器给 Mate 30 手机充电
        Mate30 mate30 = new Mate30(new AndroidCharger());
        mate30.charge();
        System.out.println("==============================");

        // 使用适配器，使用安卓充电器给 iphone8 充电
        Adapter adapter = new Adapter(new AndroidCharger());
        Iphone8 myIphone8 = new Iphone8();
        myIphone8.setLightningInterface(adapter);
        myIphone8.charge();

    }

}
