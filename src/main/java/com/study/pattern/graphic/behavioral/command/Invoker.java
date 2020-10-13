package com.study.pattern.graphic.behavioral.command;

/**
 * 请求者角色类
 *
 * @author Sky
 * @date 2020-10-13 10:13.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

}
