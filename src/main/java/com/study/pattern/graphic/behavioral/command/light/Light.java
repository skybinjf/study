package com.study.pattern.graphic.behavioral.command.light;

/**
 * 將控制燈光用命令模式實作
 *
 * @author Sky
 * @date 2020-10-13 15:00.
 */
public class Light {

    public void turnOn() {
        System.out.println("打开灯");
    }

    public void turnOff() {
        System.out.println("关闭灯");
    }

    public void brighter() {
        System.out.println("提高亮度");
    }

    public void darker() {
        System.out.println("降低亮度");
    }
}
