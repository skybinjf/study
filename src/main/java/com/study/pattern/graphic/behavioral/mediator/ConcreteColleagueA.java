package com.study.pattern.graphic.behavioral.mediator;

/**
 * 具体的同事类
 *
 * @author Sky
 * @date 2020-10-14 14:42.
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void operate() {
        getMediator().change(this);
    }

    @Override
    public void doHelp() {
        System.out.println("同事 A 正在协助");
    }
}
