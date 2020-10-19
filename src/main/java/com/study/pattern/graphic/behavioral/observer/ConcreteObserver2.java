package com.study.pattern.graphic.behavioral.observer;

/**
 * 具体的观察者2
 *
 * @author Sky
 * @date 2020-10-19 10:58.
 */
public class ConcreteObserver2 implements Observer {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void update(String message) {
        System.out.println("观察者2收到信息：" + message + "。并进行处理");
    }
}
