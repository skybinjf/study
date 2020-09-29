package com.study.pattern.graphic.structural.bridge;

/**
 * 桥接实现接口
 *
 * @author Sky
 * @date 2020-09-28 16:58.
 */
public interface DrawAPI {

    /**
     * 画圆
     * @param radius 半径
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);
}
