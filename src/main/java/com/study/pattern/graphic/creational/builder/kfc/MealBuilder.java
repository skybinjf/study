package com.study.pattern.graphic.creational.builder.kfc;

/**
 * 进餐建造者
 *
 * @author Sky
 * @Date 2019-12-04 19:41.
 */
public interface MealBuilder {
    void buildDrink();
    void buildFood();

    Meal getMeal();
}
