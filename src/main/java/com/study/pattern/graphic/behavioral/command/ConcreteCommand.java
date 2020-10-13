package com.study.pattern.graphic.behavioral.command;

/**
 * 具体命令角色类
 *
 * @author Sky
 * @date 2020-10-13 10:12.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //通常会转调接收者的形影方法，让接收者来真正执行功能
        receiver.action();
    }
}
