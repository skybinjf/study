package com.study.pattern.graphic.behavioral.command.audio;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的宏命令 MacroAudioCommand 类负责把单个的命令合成宏命令
 *
 * @author Sky
 * @date 2020-10-13 14:51.
 */
public class MacroAudioCommand implements MacroCommand {

    private List<Command> commandList = new ArrayList<>(8);

    @Override
    public void execute() {
        System.out.println("----自动回放保存的宏命令----");
        for (Command command : commandList) {
            command.execute();
        }
        System.out.println("----宏命令执行完毕----");
    }

    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }
}
