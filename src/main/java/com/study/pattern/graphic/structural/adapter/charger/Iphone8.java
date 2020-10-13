package com.study.pattern.graphic.structural.adapter.charger;

/**
 * iphone 8 手机
 *
 * @author Sky
 * @date 2020-09-28 13:55.
 */
public class Iphone8 {

    private LightningInterface lightningInterface;

    public Iphone8() { }

    public Iphone8(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }

    public void charge() {
        System.out.println("开始给 Iphone 8 手机充电……");
        lightningInterface.chargeWithLightning();
        System.out.println("结束给 Iphone 8 手机充电……");
    }

    public void setLightningInterface(LightningInterface lightningInterface) {
        this.lightningInterface = lightningInterface;
    }
}
