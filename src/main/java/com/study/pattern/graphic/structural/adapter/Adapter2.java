package com.study.pattern.graphic.structural.adapter;

/**
 * 对象的适配器模式
 *
 * 以成员变量的形式使用适配者
 *
 * @author Sky
 * @date 2020-09-27 16:36.
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("使用适配者……");
        adaptee.specificRequest();
    }
}
