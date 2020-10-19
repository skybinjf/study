package com.study.pattern.graphic.behavioral.observer;

/**
 * 具体的被观察者
 *
 * @author Sky
 * @date 2020-10-19 10:55.
 */
public class ConcreteSubject extends Subject {

    @Override
    void notifyObservers(String message)  {
        System.out.println("被观察者事件发生改变");
        for (Observer observer : this.observerVector) {
            observer.update(message);
        }
    }
}
