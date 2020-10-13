package com.study.pattern.graphic.structural.bridge;

/**
 * 实现了 DrawAPI 接口的实体桥接实现类
 *
 * @author Sky
 * @date 2020-09-28 17:01.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
