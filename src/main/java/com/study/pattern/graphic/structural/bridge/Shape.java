package com.study.pattern.graphic.structural.bridge;

/**
 * 抽象类 Shape（形状）
 *
 * @author Sky
 * @date 2020-09-28 17:03.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    /**
     * 画图形
     */
    abstract void draw();
}
