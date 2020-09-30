package com.study.pattern.graphic.structural.facade.shape;

/**
 * 测试类
 *
 * @author Sky
 * @date 2020-09-29 13:57.
 */
public class ShapeTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
