package com.study.pattern.graphic.behavioral.command.light;

/**
 * 调低亮度
 *
 * @author Sky
 * @date 2020-10-13 15:08.
 */
public class DarkerCommand extends Command {

    public DarkerCommand(Light light) {
        super(light);
    }

    @Override
    void execute() {
        light.darker();
    }
}
