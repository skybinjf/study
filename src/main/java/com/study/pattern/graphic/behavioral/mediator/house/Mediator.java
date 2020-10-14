package com.study.pattern.graphic.behavioral.mediator.house;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介者类
 *
 * @author Sky
 * @date 2020-10-14 15:22.
 */
public abstract class Mediator {
    /**
     * 用于添加储存 "房东"角色
     */
    protected List<Person> landlordList = new ArrayList<>(8);
    /**
     * 用于添加储存 "求租者"角色
     */
    protected List<Person> renterList = new ArrayList<>(8);

    void registerLandlord(Person person) {
        landlordList.add(person);
    }

    void registerRenter(Person person) {
        renterList.add(person);
    }

    abstract void operation(Person person, String message);
}
