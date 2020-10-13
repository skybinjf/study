package com.study.pattern.graphic.behavioral.command.light;

import java.util.ArrayList;
import java.util.List;

/**
 * 燈光的遙控器，可以儲存 commands
 *
 * @author Sky
 * @date 2020-10-13 15:08.
 */
public class Invoker {

    private List<Command> commandList = new ArrayList<>(8);

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
