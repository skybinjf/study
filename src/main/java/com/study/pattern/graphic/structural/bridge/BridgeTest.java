package com.study.pattern.graphic.structural.bridge;

/**
 * 桥接模式测试类
 *
 * @author Sky
 * @date 2020-09-28 17:09.
 */
public class BridgeTest {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
