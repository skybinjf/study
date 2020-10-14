package com.study.pattern.graphic.behavioral.mediator;

/**
 * 体的同事类
 *
 * @author Sky
 * @date 2020-10-14 14:44.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void operate() {
        getMediator().change(this);
    }

    @Override
    public void doHelp() {
        System.out.println("同事 B 正在协助");
    }
}
