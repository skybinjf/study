package com.study.pattern.graphic.creational.builder.kfc;

/**
 * //TODO
 *
 * @author Sky
 * @date 2019-12-04 19:43.
 */
public class SubMealBuilderB implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void buildDrink() {
        meal.setDrink("Meal-Drink-B");
    }

    @Override
    public void buildFood() {
        meal.setFood("Meal-Food-B");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
