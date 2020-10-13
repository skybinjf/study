package com.study.pattern.graphic.structural.bridge;

/**
 * 实现了 Shape 接口的实体类
 *
 * @author Sky
 * @date 2020-09-28 17:06.
 */
public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
