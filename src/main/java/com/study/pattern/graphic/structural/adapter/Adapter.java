package com.study.pattern.graphic.structural.adapter;

/**
 * 适配器（类适配器）
 * 适配器 Adapter 继承自 Adaptee，同时又实现了目标(Target)接口
 *
 * @author Sky
 * @date 2020-09-17 16:27.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        System.out.println("使用适配者……");
        this.specificRequest();
    }
}
