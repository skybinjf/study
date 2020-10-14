package com.study.pattern.graphic.behavioral.mediator;

/**
 * 客户端测试
 *
 * @author Sky
 * @date 2020-10-14 14:45.
 */
public class Client {

    public static void main(String[] args) {
        // 创建中介者
        ConcreteMediator mediator = new ConcreteMediator();

        // 创建同事类
        Colleague colleagueA = new ConcreteColleagueA(mediator);
        Colleague colleagueB = new ConcreteColleagueB(mediator);

        // 让中介者知道所有的同事
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        // 同事类 A 变化
        colleagueA.operate();
        System.out.println("-----------");

        // 同事类 B 变化
        colleagueB.operate();
    }
}
