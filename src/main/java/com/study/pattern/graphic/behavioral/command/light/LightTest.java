package com.study.pattern.graphic.behavioral.command.light;

/**
 * 灯测试类
 *
 * @author Sky
 * @date 2020-10-13 15:10.
 */
public class LightTest {

    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);
        Command brighter = new BrighterCommand(light);
        Command darker = new DarkerCommand(light);

        Invoker invoker = new Invoker();
        invoker.addCommand(turnOn);
        invoker.addCommand(brighter);
        invoker.addCommand(darker);
        invoker.addCommand(turnOff);

        invoker.execute();
    }

}
