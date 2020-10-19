package com.study.pattern.graphic.behavioral.observer.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * 事件发布者
 *
 * @author Sky
 * @date 2020-10-19 13:40.
 */
@Component
public class MyPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void publishEvent(ApplicationEvent event) {
        System.out.println("publish event.");
        applicationContext.publishEvent(event);
    }
}
