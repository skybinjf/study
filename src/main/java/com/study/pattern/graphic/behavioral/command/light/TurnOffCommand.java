package com.study.pattern.graphic.behavioral.command.light;

/**
 * 关灯
 *
 * @author Sky
 * @date 2020-10-13 15:06.
 */
public class TurnOffCommand extends Command {

    public TurnOffCommand(Light light) {
        super(light);
    }

    @Override
    void execute() {
        light.turnOff();
    }
}
