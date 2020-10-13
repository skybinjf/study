package com.study.pattern.graphic.structural.facade.shape;

/**
 * 长方形
 *
 * @author Sky
 * @date 2020-09-29 13:49.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle……");
    }
}
