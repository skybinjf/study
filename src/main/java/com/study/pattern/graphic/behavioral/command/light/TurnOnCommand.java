package com.study.pattern.graphic.behavioral.command.light;

/**
 * 开灯的 Command
 *
 * @author Sky
 * @date 2020-10-13 15:03.
 */
public class TurnOnCommand extends Command {

    public TurnOnCommand(Light light) {
        super(light);
    }

    @Override
    void execute() {
        light.turnOn();
    }
}
