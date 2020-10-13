package com.study.pattern.graphic.structural.adapter.charger;

/**
 *  适配器，将 Micro Usb 接口转成 Lightning 接口
 *
 * @author Sky
 * @date 2020-09-28 14:01.
 */
public class Adapter implements LightningInterface {

    private MicroUsbInterface microUsbInterface;

    public Adapter(){}

    public Adapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightning() {
        System.out.println("使用适配者……");
        microUsbInterface.chargeWithMicroUsb();
    }
}
