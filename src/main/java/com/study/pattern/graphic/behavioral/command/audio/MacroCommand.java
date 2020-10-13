package com.study.pattern.graphic.behavioral.command.audio;

/**
 * 宏命令
 * 系统需要一个代表宏命令的接口，以定义出具体宏命令所需要的接口
 *
 * @author Sky
 * @date 2020-10-13 14:49.
 */
public interface MacroCommand extends Command {

    /**
     * 宏命令集的管理方法
     * 可以添加一个成员指令
     * @param command
     */
    void add(Command command);

    /**
     * 移除一个成员命令
     * @param command
     */
    void remove(Command command);
}
