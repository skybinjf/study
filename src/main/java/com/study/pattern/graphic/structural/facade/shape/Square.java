package com.study.pattern.graphic.structural.facade.shape;

/**
 * 正方形
 *
 * @author Sky
 * @date 2020-09-29 13:50.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw square……");
    }
}
