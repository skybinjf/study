package com.study.pattern.graphic.behavioral.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 定义事件
 *
 * @author Sky
 * @date 2020-10-19 11:10.
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
        System.out.println("My Event.");
    }
}
