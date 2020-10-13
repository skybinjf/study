package com.study.pattern.graphic.creational.builder.kfc;

/**
 * 具体建造者-生产食物套餐 A
 *
 * @author Sky
 * @date 2019-12-04 19:43.
 */
public class SubMealBuilderA implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void buildDrink() {
        meal.setDrink("Meal-Drink-A");
    }

    @Override
    public void buildFood() {
        meal.setFood("Meal-Food-A");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
