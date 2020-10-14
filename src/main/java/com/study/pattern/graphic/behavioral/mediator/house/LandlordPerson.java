package com.study.pattern.graphic.behavioral.mediator.house;

/**
 * 具体同事类 房屋出租者[房东]
 *
 * @author Sky
 * @date 2020-10-14 15:41.
 */
public class LandlordPerson extends Person {

    public LandlordPerson(String name, Mediator mediator) {
        super(name, mediator);
    }

    @Override
    void sendMessage(String msg) {
        mediator.operation(this, msg);
    }

    @Override
    void getMessage(String msg) {
        System.out.println("房东[" + name + "]收到中介发来的消息：" + msg);
    }
}
