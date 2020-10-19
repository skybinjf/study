package com.study.pattern.graphic.behavioral.observer;

/**
 * 客户端类，测试
 *
 * @author Sky
 * @date 2020-10-19 10:59.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver1());
        subject.addObserver(new ConcreteObserver2());
        subject.notifyObservers("我是Sky");
    }
}
