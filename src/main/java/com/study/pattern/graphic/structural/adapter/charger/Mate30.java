package com.study.pattern.graphic.structural.adapter.charger;

/**
 * 华为 Mate 30 手机
 *
 * @author Sky
 * @date 2020-09-28 13:59.
 */
public class Mate30 {

    private MicroUsbInterface microUsbInterface;

    public Mate30(){}

    public Mate30(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge() {
        System.out.println("开始给 Mate 30 手机充电……");
        microUsbInterface.chargeWithMicroUsb();
        System.out.println("结束给 Mate 30 手机充电……");
    }

}
