package com.study.pattern.graphic.behavioral.command.light;

/**
 * 调高亮度
 *
 * @author Sky
 * @date 2020-10-13 15:07.
 */
public class BrighterCommand extends Command {

    public BrighterCommand(Light light) {
        super(light);
    }

    @Override
    void execute() {
        light.brighter();
    }
}
