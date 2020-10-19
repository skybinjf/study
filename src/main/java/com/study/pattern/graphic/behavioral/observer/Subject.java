package com.study.pattern.graphic.behavioral.observer;

import java.util.Vector;

/**
 * 被观察者
 *
 * @author Sky
 * @date 2020-10-19 10:51.
 */
public abstract class Subject {

    /**
     * 线程安全
     */
    protected Vector<Observer> observerVector = new Vector<>(8);

    /**
     * 增加观察者
     * @param observer
     */
    void addObserver(Observer observer) {
        this.observerVector.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    void delObserver(Observer observer) {
        this.observerVector.remove(observer);
    }

    /**
     * 通知观察者
     */
    abstract void notifyObservers(String message);
}
