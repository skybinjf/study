package com.study.pattern.graphic.behavioral.mediator;

/**
 * 具体中介者
 * 中介者需要知道所有的具体的同事类
 *
 * @author Sky
 * @date 2020-10-14 14:17.
 */
public class ConcreteMediator implements Mediator {

    private Colleague concreteColleagueA;
    private Colleague concreteColleagueB;

    public void setColleagueA(Colleague colleague) {
        this.concreteColleagueA = colleague;
    }

    public void setColleagueB(Colleague colleague) {
        this.concreteColleagueB = colleague;
    }


    @Override
    public void change(Colleague colleague) {
        if (colleague == concreteColleagueA) {
            System.out.println("同事类 A 发生了变化，需要 B 协助");
            concreteColleagueB.doHelp();
        } else if (colleague == concreteColleagueB) {
            System.out.println("同事类 B 发生了变化，需要 A 协助");
            concreteColleagueA.doHelp();
        }
    }
}
