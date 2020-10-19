package com.study.pattern.graphic.behavioral.observer.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 客户端测试
 *
 * @author Sky
 * @date 2020-10-19 13:43.
 */
public class Client {

    @Test
    public void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyPublisher myPublisher = (MyPublisher) context.getBean("myPublisher");
        myPublisher.publishEvent(new MyEvent(this));
    }

}
