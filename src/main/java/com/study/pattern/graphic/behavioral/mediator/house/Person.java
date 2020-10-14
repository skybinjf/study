package com.study.pattern.graphic.behavioral.mediator.house;

/**
 * 抽象同事类
 *
 * @author Sky
 * @date 2020-10-14 15:19.
 */
public abstract class Person {

    /**
     * 要设置成 protected，不然子类访问不到
     */
    protected Mediator mediator;
    protected String name;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void sendMessage(String msg);

    abstract void getMessage(String msg);
}
