package com.study.pattern.graphic.behavioral.command;

/**
 * 接收者角色类
 *
 * @author Sky
 * @date 2020-10-13 10:10.
 */
public class Receiver {

    /**
     * 真正执行命令相应的操作
     */
    public void action() {
        System.out.println("执行操作");
    }
}
