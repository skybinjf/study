package com.study.pattern.graphic.structural.bridge;

/**
 * 画绿色的圆
 *
 * @author Sky
 * @date 2020-09-28 17:02.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
