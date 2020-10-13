package com.study.pattern.graphic.structural.adapter.charger;

/**
 * 安卓设备的充电器
 *
 * @author Sky
 * @date 2020-09-28 13:52.
 */
public class AndroidCharger implements MicroUsbInterface {
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用 Micro Usb 型号的充电器充电……");
    }
}
