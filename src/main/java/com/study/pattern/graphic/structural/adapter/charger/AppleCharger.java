package com.study.pattern.graphic.structural.adapter.charger;

/**
 * 苹果设备的充电器
 *
 * @author Sky
 * @date 2020-09-28 13:54.
 */
public class AppleCharger implements LightningInterface {
    @Override
    public void chargeWithLightning() {
        System.out.println("使用 Lightning 型号的充电器充电……");
    }
}
