package com.study.pattern.graphic.structural.facade.shape;

/**
 * 画圆
 *
 * @author Sky
 * @date 2020-09-29 13:48.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw circle……");
    }
}
