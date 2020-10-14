package com.study.pattern.graphic.behavioral.mediator.house;

/**
 * 房屋求租者
 *
 * @author Sky
 * @date 2020-10-14 15:26.
 */
public class RenterPerson extends Person {

    public RenterPerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String msg) {
        mediator.operation(this, msg);
    }

    @Override
    void getMessage(String msg) {
        System.out.println("求租者[" + name + "]收到中介发来的消息： " + msg);
    }
}
