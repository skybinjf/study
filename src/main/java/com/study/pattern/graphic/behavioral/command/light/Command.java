package com.study.pattern.graphic.behavioral.command.light;

/**
 * 對燈光控制的 Command 界面
 *
 * @author Sky
 * @Date 2020-10-13 15:01.
 */
public abstract class Command {

    Light light;

    public Command(Light light) {
        this.light = light;
    }

    abstract void execute();
}
