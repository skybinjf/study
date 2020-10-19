package com.study.pattern.graphic.behavioral.observer.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 用注解方式将 MyPublisher 注入 Spring
 *
 * @author Sky
 * @date 2020-10-19 13:42.
 */
@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name="myPublisher")
    public MyPublisher myPublisher() {
        return new MyPublisher();
    }
}
