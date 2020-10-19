package com.study.pattern.graphic.behavioral.observer.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 实现事件监听器
 *
 * @author Sky
 * @date 2020-10-19 11:13.
 */
@Component
public class MyListenerA implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("ListenerA received.");
    }
}
