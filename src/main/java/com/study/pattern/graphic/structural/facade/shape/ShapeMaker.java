package com.study.pattern.graphic.structural.facade.shape;

/**
 * 外观类 ShapeMaker
 *
 * @author Sky
 * @date 2020-09-29 13:51.
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    /**
     * 画圆
     */
    public void drawCircle() {
        circle.draw();
    }

    /**
     * 画长方形
     */
    public void drawRectangle() {
        rectangle.draw();
    }

    /**
     * 画正方形
     */
    public void drawSquare() {
        square.draw();
    }

}
